package ExpenseManager;

public class ExpenseManager {
    private String entryMode;

    // variables for each expense category
    private double travel;
    private double housing;
    private double utilities;
    private double entertainment;
    private double food;

    // chooses expenses to be monthly or yearly
    public void setEntryMode(String mode) {
        mode = mode.toLowerCase();

        // Validate mode is 'monthly' or 'yearly'
        if (mode.equals("monthly") || mode.equals("yearly")) {
            this.entryMode = mode;
        } else {
            // If input invalid, default to yearly
            System.out.println("Invalid entry mode, defaulting to 'yearly'.");
            this.entryMode = "yearly";
        }

    }

    // multiplies monthly amount by 12
    public double convertMonthlyToYearly(double monthlyAmount) {
        return monthlyAmount * 12;
    }

    // add expense to specific category and converts from monthly to yearly if needed
    public void addExpense(String category, double amount) {
        if (entryMode == null) {
            System.out.println("Invalid entry mode, defaulting to 'yearly'.");
            entryMode = "yearly";
        }

        // convert to yearly if mode is monthly
        if (entryMode.equals("monthly")) {
            amount = convertMonthlyToYearly(amount);
        }

        // add to the right category
        switch (category.toLowerCase()) {
            case "travel":
                travel += amount;
                break;
            case "housing":
                housing += amount;
                break;
            case "utilities":
                utilities += amount;
                break;
            case "entertainment":
                entertainment += amount;
                break;
            case "food":
                food += amount;
                break;
            default:
                System.out.println("Unknown category: " + category);
        }
    }

    // adds all expenses and returns amount
    public double getTotalExpenses() {
        return travel + housing + utilities + entertainment + food;
    }
}

// could make getters for each expense category?
