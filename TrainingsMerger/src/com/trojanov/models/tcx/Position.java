package com.trojanov.models.tcx;

public class Position {
	private Double latitudeDegrees;
	private Double longitudeDegrees;
	
	public Position(Double latitudeDegrees, Double longitudeDegrees) {
		super();
		this.latitudeDegrees = latitudeDegrees;
		this.longitudeDegrees = longitudeDegrees;
	}

	public Double getLatitudeDegrees() {
		return latitudeDegrees;
	}

	public void setLatitudeDegrees(Double latitudeDegrees) {
		this.latitudeDegrees = latitudeDegrees;
	}

	public Double getLongitudeDegrees() {
		return longitudeDegrees;
	}

	public void setLongitudeDegrees(Double longitudeDegrees) {
		this.longitudeDegrees = longitudeDegrees;
	}
	
	
}
