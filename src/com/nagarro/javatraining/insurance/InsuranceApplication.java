package com.nagarro.javatraining.insurance;

import java.util.ArrayList;

import com.nagarro.javatraining.insurance.input.UserInput;
import com.nagarro.javatraining.insurance.model.CarDetails;
import com.nagarro.javatraining.insurance.output.UserOutput;

public class InsuranceApplication {

	public static void main(String args[]) {

		UserInput userInput = new UserInput();
		ArrayList<CarDetails> carDetails = userInput.getCarDetails();
		UserOutput userOutput = new UserOutput();
		userOutput.displayData(carDetails);
	}
}
