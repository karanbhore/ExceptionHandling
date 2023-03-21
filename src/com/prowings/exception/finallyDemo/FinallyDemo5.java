package com.prowings.exception.finallyDemo;

public class FinallyDemo5 {
	public static void main(String[] args) {
		try {
			int i = 5;
			System.out.println("inside try 1");
			if (i != 10) {
				System.exit(0);
			}
			System.out.println("inside try2");

		} catch (Exception e) {
			System.out.println("inside catch");
		} finally {
			System.out.println("inside finally");
		}

	}
}
