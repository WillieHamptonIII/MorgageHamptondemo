public class MortgageHamptondemo {
    public static void main(String[] args) {
        MortgageHampton mortgage = new MortgageHampton();
        mortgage.readInput();

        System.out.println("Mortgage Details:");
        mortgage.writeOutput();

        double amountOweAfterOneYear = mortgage.calculateAmountOweAfterOneYear();
        System.out.println("Amount owed after 1 year: $" + amountOweAfterOneYear);

        // Pass the current balance to principleMonthlyPayment
        System.out.println("Principal monthly payment: $" + mortgage.principleMonthlyPayment(mortgage.AmountOwe));
    }
}

