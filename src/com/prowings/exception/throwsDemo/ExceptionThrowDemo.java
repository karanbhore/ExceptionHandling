package com.prowings.exception.throwsDemo;

public class ExceptionThrowDemo {

	public static void myMethod() throws Exception {
		int res = 10 / 0;
		System.out.println(res);
		System.out.println("myMethod ended!!");
	}

//	public static void myOtherMethod() {
//		try {
//			myMethod();
//		} catch (Exception e) {
//			System.out.println("Exception occured!! in myMethod!!");
//			System.out.println(e.getMessage());
////			System.out.println(e.printStackTrace());
//		}
//
//	}

	public static void main(String[] args) {

		System.out.println("main method started!!");
          try {
			myMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
          System.out.println("main method ended!!");
	}
}
