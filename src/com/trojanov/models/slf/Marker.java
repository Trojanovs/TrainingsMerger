package com.trojanov.models.slf;

public class Marker {
	private String type;
	private int number;
	private int timeAbsolute;
	private int duration;
	private int distanceAbsolute;
	
	public Marker(String type, int number, int timeAbsolute, int duration,
			int distanceAbsolute) {
		super();
		this.type = type;
		this.number = number;
		this.timeAbsolute = timeAbsolute;
		this.duration = duration;
		this.distanceAbsolute = distanceAbsolute;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTimeAbsolute() {
		return timeAbsolute;
	}

	public void setTimeAbsolute(int timeAbsolute) {
		this.timeAbsolute = timeAbsolute;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getDistanceAbsolute() {
		return distanceAbsolute;
	}

	public void setDistanceAbsolute(int distanceAbsolute) {
		this.distanceAbsolute = distanceAbsolute;
	}	
}
