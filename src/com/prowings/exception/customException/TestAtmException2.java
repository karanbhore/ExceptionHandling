package com.prowings.exception.customException;

public class TestAtmException2 {

	public static void main(String[] args) {
		Atm atm = new Atm("11f`0000", 50000, 100000);
		System.out.println("atm is generated!!!");
		System.out.println(atm);
		System.out.println();

		String res = "";
		try {
			res = isValidPin(atm) ? "validPin " : "invalidPin";

		} catch (InvalidPinException e) {
			System.out.println("<<<<<<>>>>>>");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println("<<<<<>>>>>>>>>>");
		}
		System.out.println(res);

	}

	private static boolean isValidPin(Atm atm) throws InvalidPinException {

		try {
			int pin = Integer.parseInt(atm.getPin());
			if (pin == 1234) {
				return true;
			}
		}
		catch (Exception e) {
			throw new InvalidPinException("pin is not valid");
		}

		return false;
	}

}
