import java.util.Scanner;

public class Option1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("What is your income this week: ");
        double weekIncome = scanner.nextDouble();

        // Initialize variables for tax rate and bracket
        double taxRate = 0.0;
        String bracket = "";

        // Determine the applicable tax rate and bracket
        if (weekIncome < 500) {
            taxRate = 0.10;
            bracket = "10%";
        } else if (weekIncome >= 500 && weekIncome < 1500) {
            taxRate = 0.15;
            bracket = "15%";
        } else if (weekIncome >= 1500 && weekIncome < 2500) {
            taxRate = 0.20;
            bracket = "20%";
        } else {
            taxRate = 0.30;
            bracket = "30%";
        }

        // Calculate tax withholding and result
        double taxWithhold = weekIncome * taxRate;
        double result = weekIncome - taxWithhold;

        // Print results
        System.out.println("Your income is $" + weekIncome);
        System.out.println("Your tax rate is " + bracket);
        System.out.println("Your tax withholding is $" + taxWithhold);
        System.out.println("Your weekly income after tax will be $" + result);
    }
}
