/**
 * 
 */
package org.example.multi;

/**
 * 
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Task 1: Fetch user data
        CompletableFuture<String> userDataFuture = CompletableFuture.supplyAsync(() -> {
            // Simulate a delay
            sleep(1000);
            return "User Data";
        });

        // Task 2: Fetch user preferences
        CompletableFuture<String> userPreferencesFuture = CompletableFuture.supplyAsync(() -> {
            // Simulate a delay
            sleep(1500);
            return "User Preferences";
        });

        // Combine the results of both tasks
        CompletableFuture<String> combinedFuture = userDataFuture.thenCombine(userPreferencesFuture, (userData, userPreferences) -> {
            return userData + " + " + userPreferences;
        });

        // Print the Single result
        System.out.println(userDataFuture.get());
        
        // Print the Single result
        System.out.println(userPreferencesFuture.get());
        
        // Print the combined result
        System.out.println(combinedFuture.get());
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
