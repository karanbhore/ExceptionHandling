package com.prowings.exception.nestedtry;

import java.io.IOException;

public class NestedTryDemo {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		int res=0;
		try {
			System.out.println("outer try started!!");
			
			try {
				System.out.println("inner try started!!");
				res=a/b;
			}catch(IndexOutOfBoundsException  e){
				System.out.println("Arithmetic Exception caught in inner catch!!");
				
			}
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException caught in outer catch!");
			System.out.println(e.getMessage());
		}
	}
}
