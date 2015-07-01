package com.itt.quiz;

import java.util.Scanner;

public class QuizQ2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int target = input.nextInt();
		int fiver = target % 5;
		int threeer = target % 3;
		int twoer = target % 2;
		if (fiver == 0) {
			System.out.println("High Five!");
		}
		if ((threeer == 0) || (twoer == 0)) {
			System.out.println("Georgia!");
		}

	}

}
