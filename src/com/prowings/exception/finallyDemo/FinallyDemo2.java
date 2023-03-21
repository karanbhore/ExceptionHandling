package com.prowings.exception.finallyDemo;

public class FinallyDemo2 {

	public static void main(String[] args) {
		System.out.println("main started!!!");
		m1();
		System.out.println("main ended!!!");
		
	}

	public static void m1() {
    System.out.println("m1 started!!!");      

	try {
		int i=10;
		System.out.println("inside try1");
		if(i !=10)
		System.exit(0);
		System.out.println("inside try 2");
		
	}
	catch(Exception e) {
	System.out.println("inside catch");	
	}finally {
		System.out.println("inside finally");
	}
	System.out.println("m1 ended");

	}	
}
