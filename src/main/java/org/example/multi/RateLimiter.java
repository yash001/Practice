/**
 * 
 */
package org.example.multi;

/**
 * 
 */
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RateLimiter {
    private final int maxRequests;
    private final long timeWindowInSeconds;
    private final ConcurrentHashMap<String, UserRequest> userRequests = new ConcurrentHashMap<>();
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public RateLimiter(int maxRequests, long timeWindowInSeconds) {
        this.maxRequests = maxRequests;
        this.timeWindowInSeconds = timeWindowInSeconds;

        // Reset the counter periodically (e.g., every second)
        scheduler.scheduleAtFixedRate(this::resetCounters, timeWindowInSeconds, timeWindowInSeconds, TimeUnit.SECONDS);
    }

    public boolean allowRequest(String userId) {
        UserRequest userRequest = userRequests.computeIfAbsent(userId, id -> new UserRequest());
        
        synchronized (userRequest) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - userRequest.startTime >= timeWindowInSeconds * 1000) {
                // Reset the count if time window has passed
                userRequest.requestCount = 0;
                userRequest.startTime = currentTime;
            }

            if (userRequest.requestCount < maxRequests) {
                userRequest.requestCount++;
                return true;  // Request is allowed
            } else {
                return false;  // Rate limit exceeded
            }
        }
    }

    // Periodic task to reset the counters
    private void resetCounters() {
        userRequests.forEach((userId, userRequest) -> {
            synchronized (userRequest) {
                long currentTime = System.currentTimeMillis();
                if (currentTime - userRequest.startTime >= timeWindowInSeconds * 1000) {
                    // Reset the counter
                    userRequest.requestCount = 0;
                    userRequest.startTime = currentTime;
                }
            }
        });
    }

    // Internal class to represent the user request count and window
    private static class UserRequest {
        private long requestCount = 0;
        private long startTime = System.currentTimeMillis();
    }

    // Shutdown the scheduler properly
    public void shutdown() {
        scheduler.shutdown();
    }

    public static void main(String[] args) {
        RateLimiter rateLimiter = new RateLimiter(10, 1);  // 10 requests per second

        // Simulate requests from multiple threads
        for (int i = 0; i < 20; i++) {
            final int userId = i % 5;  // 5 users
            new Thread(() -> {
                if (rateLimiter.allowRequest("user-" + userId)) {
                    System.out.println("Request allowed for user-" + userId);
                } else {
                    System.out.println("Rate limit exceeded for user-" + userId);
                }
            }).start();
        }

        rateLimiter.shutdown();  // Shutdown the rate limiter after usage
    }
}
