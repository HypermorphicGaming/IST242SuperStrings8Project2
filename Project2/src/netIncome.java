import java.util.Scanner;
import taxCalculator.taxCalculator;
import insurance.Insurance;
import UserIO.UserIO;
import ExpenseManager.ExpenseManager;


public class netIncome{
    public static void main(String[] args){
        // Objects
        Scanner input = new Scanner(System.in);
        taxCalculator calc = new taxCalculator();
        UserIO userInterface = new UserIO();
        ExpenseManager expenseManager = new ExpenseManager();

        // Variables
        int filingStatus;
        String[] filingMenu = {"Married Filing Jointly", "Married Filing Separately/Single", "Head of Household"};
        double totalDuductions;
        double totalRevenue;
        double tax = 0;
        double netIncome;

        // Displayables
        userInterface.displayMessage("Welcome!");

        System.out.print("Enter total revenue: $");
        totalRevenue = input.nextDouble();

        // Travel
        System.out.print("Input your travel expense (MONTHLY OR YEARLY): ");
        expenseManager.setEntryMode(input.next());
        System.out.print("$");
        expenseManager.addExpense("travel", input.nextDouble());

        // Housing
        System.out.print("Input your housing expense (MONTHLY OR YEARLY): ");
        expenseManager.setEntryMode(input.next());
        System.out.print("$");
        expenseManager.addExpense("housing", input.nextDouble());

        // Utilities
        System.out.print("Input your utilities expense (MONTHLY OR YEARLY): ");
        expenseManager.setEntryMode(input.next());
        System.out.print("$");
        expenseManager.addExpense("utilities", input.nextDouble());

        // Entertainment
        System.out.print("Input your entertainment expense (MONTHLY OR YEARLY): ");
        expenseManager.setEntryMode(input.next());
        System.out.print("$");
        expenseManager.addExpense("entertainment", input.nextDouble());
        // Food
        System.out.print("Input your food expense (MONTHLY OR YEARLY): ");
        expenseManager.setEntryMode(input.next());
        System.out.print("$");
        expenseManager.addExpense("food", input.nextDouble());


        totalDuductions = Insurance.calculateTotalDeductions();

        filingStatus = userInterface.getMenuChoice(filingMenu);
        switch (filingStatus){
            case 1:
                tax = calc.calculateMFJTax(totalRevenue-totalDuductions);
                break;
            case 2:
                tax =calc.calculateSoMFSTax(totalRevenue-totalDuductions);
                break;
            case 3:
                tax = calc.calculateHoHTax(totalRevenue-totalDuductions);
                break;
            default:
                System.out.println("Error. You should not see this.");
                break;
        }

        netIncome = totalRevenue - tax - expenseManager.getTotalExpenses();

        System.out.println("Tax: " + tax);
        System.out.println("Net Income: " + netIncome);
        if (netIncome <= 0){
            System.out.printf("You are short $%.2f\n", Math.abs(netIncome));
            System.out.println("We recommend you get a raise or a second job.");
        }
    }
}


