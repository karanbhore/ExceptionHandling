package com.prowings.exception.delegation;

import java.sql.SQLException;

public class ThrowDemo {

	public static void main(String[] args) throws SQLException {
		System.out.println("main started!!");
		m1();
		System.out.println("main ended!!");
		
	}
	public static void m1() throws SQLException {
		System.out.println("m1 started!!");
		try
		{
			System.out.println("try started!!");
			int res=20/0;
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exc occurred but converted to NPE");
			
			throw new SQLException();
		}
	}
}
