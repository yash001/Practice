/**
 * 
 */
package org.example.notes;

/**
 * Write a java program to Create a method takes the total number of days and the first day of the week and return a map which contains name of the week and it's count.
 * 
 */
import java.util.HashMap;
import java.util.Map;

public class WeekdayCounter {

    // Method to count the occurrences of each day of the week
    public static Map<String, Integer> countWeekdays(int totalDays, String firstDay) {
        Map<String, Integer> dayCountMap = new HashMap<>();
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        // Find the starting index for the first day
        int startIndex = -1;
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (daysOfWeek[i].equalsIgnoreCase(firstDay)) {
                startIndex = i;
                break;
            }
        }

        if (startIndex == -1) {
            throw new IllegalArgumentException("Invalid first day of the week: " + firstDay);
        }

        // Initialize map with all days set to 0 count
        for (String day : daysOfWeek) {
            dayCountMap.put(day, 0);
        }

        // Count occurrences of each day
        for (int i = 0; i < totalDays; i++) {
            int dayIndex = (startIndex + i) % 7;
            String currentDay = daysOfWeek[dayIndex];
            dayCountMap.put(currentDay, dayCountMap.get(currentDay) + 1);
        }

        return dayCountMap;
    }

    public static void main(String[] args) {
        int totalDays = 10;
        String firstDay = "Wednesday";

        Map<String, Integer> weekdayCounts = countWeekdays(totalDays, firstDay);

        // Print the result
        for (Map.Entry<String, Integer> entry : weekdayCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

