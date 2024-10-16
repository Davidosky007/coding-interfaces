// Interface defining the methods
interface DayCalculator {
    // Method to return the number of hours in a single day
    int getHoursInDay();

    // Method to calculate total hours in a given number of days
    int getTotalHoursForDays(int days);
}

// Class that implements the interface
class DayHoursCalculator implements DayCalculator {
    
    // Implementing the method that returns the number of hours in a day
    @Override
    public int getHoursInDay() {
        return 24; // A day has 24 hours
    }

    // Implementing the method that calculates total hours in given days
    @Override
    public int getTotalHoursForDays(int days) {
        // Total hours = number of days * hours in one day
        return days * getHoursInDay();
    }
}

// Main class to test the implementation
public class HoursInDay {
    public static void main(String[] args) {
        // Create an instance of DayHoursCalculator
        DayHoursCalculator calculator = new DayHoursCalculator();
        
        // Get hours in a day
        System.out.println("Hours in a day: " + calculator.getHoursInDay());

        // Calculate total hours for 5 days
        int days = 5;
        System.out.println("Total hours in " + days + " days: " + calculator.getTotalHoursForDays(days));
    }
}
