package ss2_loop_and_array.practice.practice2;

import java.util.Scanner;

public class LoanInterestCalculationApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of months: ");
        double month = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate = Double.parseDouble(scanner.nextLine());
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest = money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
