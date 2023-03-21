package com.prowings.exception.finallyDemo;

public class FinallyDemo4 {

	public static void main(String[] args) {
		try {
			int i=10;
			System.out.println("inside try 1");
			int res=10/2;
			System.exit(0);
			System.out.println("inside try 2");
			System.out.println("inside try 3");
			
			
			
			
		}catch(Exception e) {
			System.out.println("inside catch");
			
		}finally {
			System.out.println("inside finally");
			
		}
	}
}
