package com.nagarro.javatraining.insurance.model;

public class CarDetails {
	private String carModel;
	private String carType;
	private double carCostPrice;
	private String insuranceType;

	public CarDetails(String carType, double carCostPrice, String insuranceType, String carModel) {
		this.carModel = carModel;
		this.carType = carType;
		this.carCostPrice = carCostPrice;
		this.insuranceType = insuranceType;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public double getCarCostPrice() {
		return carCostPrice;
	}

	public void setCarCostPrice(double carCostPrice) {
		this.carCostPrice = carCostPrice;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	
	
}
