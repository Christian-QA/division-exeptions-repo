package com.qa.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalDivisionValidCheck {

	public static void catchInputMismatch() throws BigForNumTwo {

		Scanner input = new Scanner(System.in);
		int num1;
		int num2;

		try {
			System.out.println("Please select num1: ");
			num1 = input.nextInt();

			System.out.println("Please select num2: ");
			num2 = input.nextInt();

			DivisionException executor = new DivisionException();
			System.out.println(executor.divideExcept(num1, num2));

		} catch (InputMismatchException ime) {
			System.out.println("Neither num can be a String");
		} finally {

			input.close();

		}

	}

}
