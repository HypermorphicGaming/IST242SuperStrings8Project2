package UserIO;
import java.util.Scanner;
public class UserIO {

    private static Scanner scnr = new Scanner(System.in);

    // prints output
    public void displayMessage(String message) {
        System.out.println(message);
    }

    // displays prompt and returns user's number
    public double getDoubleInput(String prompt) {
        System.out.print(prompt + " ");
        while (!scnr.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scnr.next();
        }
        double input = scnr.nextDouble();
        scnr.nextLine();
        return input;
    }

    // displays prompt and returns user's text
    public String getStringInput(String prompt) {
        System.out.println(prompt);
        return scnr.nextLine();
    }

    // displays menu options and returns user choice
    public int getMenuChoice(String[] options) {
        System.out.println("Please choose an option:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        int choice = 0;
        while (true) {
            System.out.print("Enter your choice (1-" + options.length + "): ");
            if (scnr.hasNextInt()) {
                choice = scnr.nextInt();
                scnr.nextLine();
                if (choice >= 1 && choice <= options.length) {
                    break;
                }
            } else {
                scnr.nextInt();
            }
            System.out.println("Invalid choice. Try again.");
        }
        return choice;
    }
}
