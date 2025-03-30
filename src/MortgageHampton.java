import java.util.Scanner;

public class MortgageHampton {
    public double AmountOwe;
    private double MonthlyPayment;
    private double InterestRate;

    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the amount you owe:");
        AmountOwe = keyboard.nextDouble();
        System.out.println("Enter your Monthly Payment:");
        MonthlyPayment = keyboard.nextDouble();
        System.out.println("Enter your Interest Rate (in percentage, e.g., 5%):");
        InterestRate = keyboard.nextDouble() / 100;
        keyboard.close(); // Closing scanner to prevent resource leak
    }

    public void writeOutput() {
        System.out.println("The amount you entered: $" + AmountOwe);
        System.out.println("Monthly payment is: $" + MonthlyPayment);
        System.out.println("Interest rate entered: " + (InterestRate * 100) + "%");
    }

    public double interestPayment(double balance) {
        return balance * InterestRate / 12;
    }

    public double principleMonthlyPayment(double balance) {
        double interest = interestPayment(balance);
        return MonthlyPayment - interest;
    }

    public double calculateAmountOweAfterOneYear() {
        double amountOweCopy = AmountOwe;
        for (int month = 0; month < 12; month++) {
            double interest = interestPayment(amountOweCopy);
            double principlePayment = MonthlyPayment - interest;
            amountOweCopy -= principlePayment;
        }
        return amountOweCopy;
    }

}
