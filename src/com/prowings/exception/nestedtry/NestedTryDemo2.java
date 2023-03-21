package com.prowings.exception.nestedtry;

public class NestedTryDemo2 {

	public static void main(String[] args) {
		try {
			int[] nums = { 10, 20, 30 };

			System.out.println(nums[0]);
			try {
				int x = nums[2] / 0;
			} catch (ArithmeticException e) {
				System.out.println("division by zero is not possible!!");

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid Index !!");

			} finally {
				System.out.println("inner finally");

			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured!!");
			System.out.println("Invalid Index!!");

		} finally {
			System.out.println("outer finally");
		}
	}
}
