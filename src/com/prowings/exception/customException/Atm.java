package com.prowings.exception.customException;

public class Atm {

	String pin;
	double amt;
	double currentBal;
	public Atm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Atm(String pin, double amt, double currentBal) {
		super();
		this.pin = pin;
		this.amt = amt;
		this.currentBal = currentBal;
	}
	
	public String getPin() {
		return pin;
	}
	public double getAmt() {
		return amt;
	}
	
	public double getCurrentBal() {
		return currentBal;
	}
	
	@Override
	public String toString() {
		return "Atm [pin=" + pin + ", amt=" + amt + ", currentBal=" + currentBal + "]";
	}
	
	
	
}
