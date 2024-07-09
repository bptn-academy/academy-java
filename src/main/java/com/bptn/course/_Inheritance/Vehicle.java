package com.bptn.course._Inheritance;

public abstract class Vehicle {
	
	
	private String make;
	private String model;
	private int year;
	private String fuelType;
	private String fuelEfficiency;
	
	public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
		
		this.make = make;
		this.year = year;
		this.model = model;
		this.fuelType = fuelType;
		
	}
	

	
	public abstract double fuelEfficiency();
	public abstract double distanceTraveled();
	public abstract double maximumSpeed();
	
	

}
