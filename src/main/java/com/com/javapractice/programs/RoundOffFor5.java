package com.com.javapractice.programs;

public class RoundOffFor5 {

	public static void main(String[] args) {

		int res = getResult(1);
		System.out.println(res);

	}

	public static int getResult(int input) {
		int q, result;

		q = input / 5;

		if (q * 5 >= input) {
			result = input;
		}

		else if ((q + 1) * 5 - 2 <= input) {
			result = (q + 1) * 5;
		} else {
			result = input;
		}
		return result;
	}

}
