package com.prowings.exception.customException;

public class TestCustomException {

	public static void main(String[] args) {

		Citizen citizen = new Citizen(1234, "Ram", "india", "a17");

		String res = "";
		try {
			res = isValidVoter(citizen) ? " Valid Voter" : "Not Valid Voter";

		} catch (InvalidAgeException e) {
			System.out.println(">>>>>>>>>>>>>");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println("<<<<<<<<<<<<<");
		}
		System.out.println(res);

	}

	private static boolean isValidVoter(Citizen citizen) throws InvalidAgeException {
		try {
			int age = Integer.parseInt(citizen.getAge());
			if (age >= 18)
				return true;
		} catch (Exception e) {
			throw new InvalidAgeException("Age is below 18!!!");
//			activity to do before rethrowing
//			throw e; // this is exception rethrowing -as we are throwing object as it is 
//			throw new InvalidAgeException("Age is below 18!!", e);// this is exception wrapping -aswe are throwing
																	// exception object converting to the other
																	// exception

		}

		return false;
	}
}
