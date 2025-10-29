import java.util.Scanner;

public class netIncome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total revenue: ");
        double totalRevenue = input.nextDouble();

        System.out.println("Enter tax rate(%):");
        double taxRate = input.nextDouble();

        System.out.println("Are you Married Filing Jointly? (yes=1 / no=0):");
        int marriedFilingJointly = input.nextInt();

        double tax;
        if(marriedFilingJointly == 1) {
            tax = calculateMFJ(totalRevenue, taxRate);
        }else{
            tax = totalRevenue * (taxRate / 100);
        }

        double netIncome = totalRevenue - tax;

        System.out.println("Tax: " + tax);
        System.out.println("Net Income: " + netIncome);

    }

    public static double calculateMFJ(double totalRevenue, double taxRate){
    return totalRevenue * (taxRate/100) *0.9;
    }
}


