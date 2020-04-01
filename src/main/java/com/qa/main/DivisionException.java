package com.qa.main;

public class DivisionException {

	public String divideExcept(int num1, int num2) throws BigForNumTwo {

		int answer = 0;

		try {
			answer = num1 / num2;
			if (num1 < num2) {
				throw new BigForNumTwo("");
			}
		} catch (ArithmeticException ae) {
			return "Can't divide by 0";
		} catch (NullPointerException npe) {
			return "Can't be null";
		} catch (BigForNumTwo bfnt) {
			return "Num2 can't be bigger than num1";
		} catch (Exception e) {
			return "WHAT DID YOU DO?!!";
		}

		return "" + answer;
	}

}
