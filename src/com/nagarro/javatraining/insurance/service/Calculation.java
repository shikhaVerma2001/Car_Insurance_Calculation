package com.nagarro.javatraining.insurance.service;

public class Calculation {

	public static double calculateInsurance(String carType, String insuranceType, double carPrice) {
		double insurancePrice = 0;

		switch (carType) {
		case "HATCHBACK":
			insurancePrice = (5 * carPrice) / 100;
			if (insuranceType.equalsIgnoreCase("Premium"))
				insurancePrice = insurancePrice + (20 * insurancePrice) / 100;
			break;
		case "SUV":
			insurancePrice = (8 * carPrice) / 100;
			if (insuranceType.equalsIgnoreCase("Premium"))
				insurancePrice = insurancePrice + (20 * insurancePrice) / 100;
			break;
		case "SEDAN":
			insurancePrice = (10 * carPrice) / 100;
			if (insuranceType.equalsIgnoreCase("Premium"))
				insurancePrice = insurancePrice + (20 * insurancePrice) / 100;
			break;
		
		}

		return insurancePrice;
	}
}
