package com.qa.main;

public class Runner {

	public static void main(String[] args) {

		try {
			FinalDivisionValidCheck.catchInputMismatch();
		} catch (BigForNumTwo e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
