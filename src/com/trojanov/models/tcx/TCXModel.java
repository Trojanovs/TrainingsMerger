package com.trojanov.models.tcx;

import java.util.Date;
import java.util.List;

public class TCXModel {
	private Date startTime;
	private Double totalTimeSeconds;
	private Double distanceMeters;
	private int calories;
	private int averageHeartRateBpm;
	private int maximumHeartRateBpm;
	private List<Trackpoint> trackpoints;
			
	public TCXModel(Double totalTimeSeconds, Double distanceMeters, int calories,
			int averageHeartRateBpm, int maximumHeartRateBpm) {
		super();
		this.totalTimeSeconds = totalTimeSeconds;
		this.distanceMeters = distanceMeters;
		this.calories = calories;
		this.averageHeartRateBpm = averageHeartRateBpm;
		this.maximumHeartRateBpm = maximumHeartRateBpm;
	}
	
	public Double getTotalTimeSeconds() {
		return totalTimeSeconds;
	}
	public void setTotalTimeSeconds(Double totalTimeSeconds) {
		this.totalTimeSeconds = totalTimeSeconds;
	}
	public Double getDistanceMeters() {
		return distanceMeters;
	}
	public void setDistanceMeters(Double distanceMeters) {
		this.distanceMeters = distanceMeters;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getAverageHeartRateBpm() {
		return averageHeartRateBpm;
	}
	public void setAverageHeartRateBpm(int averageHeartRateBpm) {
		this.averageHeartRateBpm = averageHeartRateBpm;
	}
	public int getMaximumHeartRateBpm() {
		return maximumHeartRateBpm;
	}
	public void setMaximumHeartRateBpm(int maximumHeartRateBpm) {
		this.maximumHeartRateBpm = maximumHeartRateBpm;
	}
	public List<Trackpoint> getTrackpoints() {
		return trackpoints;
	}
	public void setTrackpoints(List<Trackpoint> trackpoints) {
		this.trackpoints = trackpoints;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
