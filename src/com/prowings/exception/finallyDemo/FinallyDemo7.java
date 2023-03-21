package com.prowings.exception.finallyDemo;

public class FinallyDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int res=m1();
		System.out.println(res);
		System.out.println("main method ended");
		
	}

	public static int m1() {

	try {
		System.out.println("inside try 1");
		int res=10/0;
		System.out.println("inside try 2");
		return 12;
		
		
	}
	catch(Exception e){
		System.out.println("Inside catch");
		return 13;
		
	}finally {
		System.out.println("Inside finally");
		return 30;
	}
	
	}
	
}
