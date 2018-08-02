package com.interest;

import java.util.Scanner;

class interest {
	public static void main(String args[]) {
		
		//Accepting input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount");
		int principalAmount = sc.nextInt();
		System.out.println("Enter rate of interest");
		float rateOfInterest = sc.nextFloat();
		System.out.println("Enter number of years");
		int numberOfYears = sc.nextInt();
		
		//Calculation of interests
		double simpleInterest, compoundInterest, amount;
		simpleInterest = (double) (principalAmount * numberOfYears * rateOfInterest) / 100;
		amount = (double) principalAmount * Math.pow((1f + rateOfInterest / 100f), numberOfYears);
		compoundInterest = amount - principalAmount;
		
		//Displaying interests
		System.out.println("Simple Interest");
		System.out.println(simpleInterest);
		System.out.println("Compound Interest");
		System.out.println(compoundInterest);
		sc.close();
	}
}
