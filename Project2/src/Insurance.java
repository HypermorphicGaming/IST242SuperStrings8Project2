import java.util.Scanner;


public class Insurance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your monthly pre-tax 401k withholding:");
        double preTax401k = input.nextDouble();

        System.out.print("Enter your monthly insurance premium: ");
        double insurancePremium = input.nextDouble();

        double totalDeductions = preTax401k + insurancePremium;

        System.out.printf("Total monthly deductions (401k + insurance): $%.2f%n", totalDeductions);


    }
}
