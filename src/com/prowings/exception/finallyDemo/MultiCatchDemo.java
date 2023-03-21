package com.prowings.exception.finallyDemo;

public class MultiCatchDemo {
	public static void main(String[] args) {
		int[] num = { 10, 20, 30 };
		int res = 0;

		try {
			res = num[5] / 0;
		} catch (Exception e) {
			System.out.println("Exception occured due to: " + e.getMessage());
		}
	}

}
