package com.ctc;

//Class to Calculate Tax on CTC 
import java.util.*;

class CTC {
	public static void main(String args[]) {
		// Initialization
		float tax = 0.0f, income;

		// Taking CTC as an input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter inconme out");
		income = scanner.nextFloat();

		// Calculation of Tax
		if (income <= 180000) {
			tax = 0;
		} else if (income <= 300000) {
			tax = (float) 0.1 * income;
		} else if (income <= 500000) {
			tax = (float) 0.2 * income;
		} else if (income > 500000) {
			tax = (float) 0.3 * income;
		}

		// Displaying Tax
		System.out.println(tax);
		scanner.close();
	}
}