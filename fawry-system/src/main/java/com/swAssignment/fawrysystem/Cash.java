package com.swAssignment.fawrysystem;

public class Cash implements Payment{

	@Override
	public boolean pay(double amount) {
		return true;
	}
}
