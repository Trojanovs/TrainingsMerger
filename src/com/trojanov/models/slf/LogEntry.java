package com.trojanov.models.slf;

public class LogEntry {
	private int number;
	private int rotations;
	private double speed;
	private int heardRate;
	private int temperature;
	private int rideTime;
	private double distance;
	private int cadence;
	
	public LogEntry(int number, int rotations, double speed, int heardRate,
			int temperature, int rideTime, double distance, int cadence) {
		super();
		this.number = number;
		this.rotations = rotations;
		this.speed = speed;
		this.heardRate = heardRate;
		this.temperature = temperature;
		this.rideTime = rideTime;
		this.distance = distance;
		this.cadence = cadence;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getRotations() {
		return rotations;
	}

	public void setRotations(int rotations) {
		this.rotations = rotations;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getHeardRate() {
		return heardRate;
	}

	public void setHeardRate(int heardRate) {
		this.heardRate = heardRate;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getRideTime() {
		return rideTime;
	}

	public void setRideTime(int rideTime) {
		this.rideTime = rideTime;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}	
}
