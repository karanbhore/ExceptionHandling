package com.prowings.exception.finallyDemo;

public class FinallyDemo6 {

	public static void main(String[] args) {
	int res=m1();
	System.out.println(res);
	}

	public static int m1() {
			try {
				System.out.println("inside try 1");
				int res=10/0;
				System.out.println("inside try 2");
				System.out.println("inside try 3");
				return 10;
				
			}
			catch(Exception e) {
				System.out.println("inside catch");
				return 20;
			}
			finally {
				System.out.println("inside finally");
				return 30;
			}

		}


	}

