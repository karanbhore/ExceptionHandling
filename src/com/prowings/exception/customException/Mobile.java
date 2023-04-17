package com.prowings.exception.customException;

public class Mobile {

	int pin;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int pin) {
		super();
		this.pin = pin;
	}
	

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Mobile [pin=" + pin + "]";
	}

}
