import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== LOAN ELIGIBILITY SYSTEM ===");

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Monthly Income: ");
        double monthlyIncome = Double.parseDouble(sc.nextLine());

        System.out.print("Enter Requested Loan: ");
        double requestedLoan = Double.parseDouble(sc.nextLine());

        System.out.print("Enter Credit Score: ");
        int creditScore = Integer.parseInt(sc.nextLine());

        double maxAllowedLoan = monthlyIncome * 6;
        double processingFee = requestedLoan * 0.02;

        boolean creditPassed = creditScore >= 650;
        boolean loanWithinLimit = requestedLoan <= maxAllowedLoan;
        boolean approved = creditPassed && loanWithinLimit;

        System.out.println();
        System.out.println("--- EVALUATION RESULT ---");
        System.out.println("Applicant Name: " + customerName);
        System.out.printf("Max Allowed Loan: PHP %.2f%n", maxAllowedLoan);
        System.out.println("Credit Score: " + creditScore + " (" + (creditPassed ? "PASSED" : "FAILED") + ")");
        System.out.println();

        if (approved) {
            System.out.println("STATUS: LOAN APPROVED");
            System.out.printf("Processing Fee: PHP %.2f%n", processingFee);
        } else {
            System.out.println("STATUS: LOAN DENIED");
        }

        sc.close();
    }
}