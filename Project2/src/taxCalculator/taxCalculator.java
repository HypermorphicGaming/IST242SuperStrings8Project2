package taxCalculator;

public class taxCalculator {
    public double calculateSoMFSTax(double income) {
        double tax;

        if (income <= 7300) {
            tax = 0;
        }
        else if (income <= 13100) {
            tax = (income - 7300) * 0.10;
        }
        else if (income <= 30875) {
            tax = 580 + (income - 13100) * 0.12;
        }
        else if (income <= 57563) {
            tax = 2713 + (income - 30875) * 0.22;
        }
        else if (income <= 103275) {
            tax = 8584.25 + (income - 57563) * 0.24;
        }
        else if (income <= 129163) {
            tax = 19555.25 + (income - 103275) * 0.32;
        }
        else if (income <= 311975) {
            tax = 27839.25 + (income - 129163) * 0.35;
        }
        else { // income > 311,975
            tax = 91823.63 + (income - 311975) * 0.37;
        }
        return tax;
    }
    public double calculateMFJTax(double income){
        double tax;
        if (income <= 14600) {
            tax = 0;
        }
        else if (income <= 26200) {
            tax = (income - 14600) * 0.10;
        }
        else if (income <= 61750) {
            tax = 1160 + (income - 26200) * 0.12;
        }
        else if (income <= 115125) {
            tax = 5426 + (income - 61750) * 0.22;
        }
        else if (income <= 206550) {
            tax = 17168.50 + (income - 115125) * 0.24;
        }
        else if (income <= 258325) {
            tax = 39110.50 + (income - 206550) * 0.32;
        }
        else if (income <= 380200) {
            tax = 55678.50 + (income - 258325) * 0.35;
        }
        else { // income > 380,200
            tax = 98334.75 + (income - 380200) * 0.37;
        }
        return tax;
    }
    public double calculateHoHTax(double income){
        double tax;

        if (income <= 10950) {
            tax = 0;
        }
        else if (income <= 19225) {
            tax = (income - 10950) * 0.10;
        }
        else if (income <= 42500) {
            tax = 827.50 + (income - 19225) * 0.12;
        }
        else if (income <= 61200) {
            tax = 3620.50 + (income - 42500) * 0.22;
        }
        else if (income <= 106925) {
            tax = 7734.50 + (income - 61200) * 0.24;
        }
        else if (income <= 132800) {
            tax = 18708.50 + (income - 106925) * 0.32;
        }
        else if (income <= 315625) {
            tax = 26988.50 + (income - 132800) * 0.35;
        }
        else { // income > 315,625
            tax = 90977.25 + (income - 315625) * 0.37;
        }
        return tax;
    }
}