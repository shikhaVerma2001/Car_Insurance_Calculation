package com.nagarro.javatraining.insurance.input;

import java.util.*;

import com.nagarro.javatraining.insurance.model.CarDetails;

public class UserInput {

	public ArrayList<CarDetails> getCarDetails() {
		ArrayList<CarDetails> carDetailsList = new ArrayList<>();
		int check = 1;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Enter your car Type : Hatchback Sedan or SUV");
			String carType = sc.next();
			System.out.println("Enter your car Model:");
			String carModel = sc.next();
			System.out.println("Enter car cost price:");
			Double carCostPrice = sc.nextDouble();
			System.out.println("Enter your insurance type:  Basic or Premium");
			String insuranceType = sc.next();
			CarDetails carDetails = new CarDetails(carType, carCostPrice, insuranceType, carModel);
			carDetailsList.add(carDetails);
			System.out.println("Do you want to enter details of any other car." + "Enter 1 for Yes and 2 for No");
			check = sc.nextInt();

		} while (check == 1);
		sc.close();
		return carDetailsList;
	}
}
