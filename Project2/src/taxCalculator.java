public class taxCalculator {
    public double calculateTax(double income){
        double tax;

        if(income <= 7300){
            tax = 0;
        }
        else if(income <= 13100){
            tax = (income - 7300) * 0.10;
        }
        else if(income <= 30875){
            tax = 580 + (income - 13100) * 0.12;
        }
        else if(income <= 57563){
            tax = 2713 + (income - 30875) * 0.22;
        }
        else if(income <= 103275){
            tax = 8584.25 + (income - 57563) * 0.24;
        }
        else if(income <= 129163){
            tax = 19555.25 + (income - 103275) * 0.32;
        }
        else if(income <= 311975){
            tax = 27839.25 + (income - 129163) * 0.35;
        }
        else{
            tax = 91823.63 + (income - 311975) * 0.37;
        }

        return tax;
    }
}
