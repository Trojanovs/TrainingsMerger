package com.trojanov.models.tcx;

import java.util.Date;

public class Trackpoint {
	private Date time;
	private Position position;
	private int heartRateBpm;
	
	private int cadence;

	public Trackpoint(Date time, Position position, int heartRateBpm,
			int cadence) {
		super();
		this.time = time;
		this.position = position;
		this.heartRateBpm = heartRateBpm;
		this.cadence = cadence;
	}

	public Trackpoint(Date time, Position position, int heartRateBpm) {
		super();
		this.time = time;
		this.position = position;
		this.heartRateBpm = heartRateBpm;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getHeartRateBpm() {
		return heartRateBpm;
	}

	public void setHeartRateBpm(int heartRateBpm) {
		this.heartRateBpm = heartRateBpm;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}


	
	
}
