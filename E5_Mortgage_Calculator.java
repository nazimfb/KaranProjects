package KaranProjects;

import java.util.Scanner;

public class E5_Mortgage_Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal amount (loan amount): ");
		double principal = sc.nextDouble();
		
		System.out.print("Enter the annual interest rate (decimal): ");
		double annualIR = sc.nextDouble();
		
		System.out.println("Enter the number of years for the loan term: ");
		int years = sc.nextInt();
		
		System.out.println("Select compounding interval (1 - Monthly(default), 2 - Weekly, 3 - Daily, 4 - Continually");
		int choice = sc.nextInt();
		
		double monthlyIR = annualIR / 12;

        int numberOfPayments = years * 12; // Monthly payments
		
		switch (choice) {
		case 1:
			numberOfPayments = years * 52; //Weekly payments
			monthlyIR = annualIR /52 /12;
			break;
		case 2:
			numberOfPayments = years * 365; //Daily payments;
			break;
		case 3:
			numberOfPayments = years *365 * 24 * 60; //Continuous compounding
            break;
			
		}
		
		double monthlyPayment = principal * (monthlyIR * Math.pow(1 + monthlyIR, numberOfPayments))
                / (Math.pow(1 + monthlyIR, numberOfPayments) - 1);

        System.out.println("Monthly Payment: $" + monthlyPayment);

        // Calculate and display the total payment
        double totalPayment = monthlyPayment * numberOfPayments;
        System.out.println("Total Payment: $" + totalPayment);

        // Calculate and display the loan duration
        int yearsPaid = numberOfPayments / 12;
        int monthsPaid = numberOfPayments % 12;
        System.out.println("Loan Duration: " + yearsPaid + " years and " + monthsPaid + " months");

        sc.close();
        
	}

}
