package com.marks;

import java.util.Scanner;

//Class that takes 3 input marks and decides the result
class marks {
	public static void main(String args[]) {
		//	Taking input of three marks
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks of subject 1");
		int marks1 = scanner.nextInt();
		System.out.println("Enter marks of subject 2");
		int marks2 = scanner.nextInt();
		System.out.println("Enter marks of subject 3");
		int marks3 = scanner.nextInt();

		//	Deciding and printing the result
		if (marks1 > 60 && marks2 > 60 && marks3 > 60) {
			System.out.println("Passed");
		} else if ((marks1 > 60 && marks2 > 60) || (marks1 > 60 && marks3 > 60) || (marks2 > 60 && marks3 > 60)) {
			System.out.println("Promoted");
		} else {
			System.out.println("Fail");
		}
		scanner.close();
	}
}
