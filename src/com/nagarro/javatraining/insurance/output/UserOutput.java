package com.nagarro.javatraining.insurance.output;

import java.util.ArrayList;

import com.nagarro.javatraining.insurance.model.CarDetails;
import com.nagarro.javatraining.insurance.service.Calculation;

public class UserOutput {
	public void displayData(ArrayList<CarDetails> carDetails) {
		for (int i = 0; i < carDetails.size(); i++) {
			CarDetails car = carDetails.get(i);
			int a = i + 1;
			double insurancePrice = Calculation.calculateInsurance(car.getCarType(), car.getInsuranceType(),
					car.getCarCostPrice());
			System.out.println("Car Model of " + a + " car :" + car.getCarModel());
			System.out.println("Cost Price of car " + a + " car :" + car.getCarCostPrice());
			System.out.println("Total insurance paid by console :" + insurancePrice);
			System.out.println();
		}
	}
}
