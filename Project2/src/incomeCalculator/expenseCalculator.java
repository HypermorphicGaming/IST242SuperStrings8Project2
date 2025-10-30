package incomeCalculator;

public class expenseCalculator {
    //array of expenses for travel, housing, utilities, entertainment, food
    private double[] expenses = new double[5];

    //enterMonthlyExpense
    public void addMonthlyExpense(double monthly[]){
        for(int i = 0; i < monthly.length; i++){
            expenses[i] = monthly[i] * 12;
        }
    }

    //enterYearlyExpense
    public void addYearlyExpense(double yearly[]){
        for(int i = 0; i < yearly.length; i++){
            expenses[i] = yearly[i];
        }
    }

    //calculateIncome
    public double calculateExpenses(){
        double total = 0;
        for(double expense : expenses){
            total += expense;
        }

        return total;
    }
}
