package com.prowings.exception.customException;

public class TestMobile {
	public static void main(String[] args) {

		Mobile mob = new Mobile(123456);

		try {
			boolean res = isValidUser(mob);
		} catch (InavlidUserException e) {
			System.out.println("invalid user");
			
			e.getMessage();
			e.printStackTrace();
		}

	}

	private static boolean isValidUser(Mobile mob) throws InavlidUserException {
		int pin = mob.getPin();
		boolean res = false;
		if (pin == 1010) {
			return true;
		} else
			throw new InavlidUserException("user is invalid");

	}
}
