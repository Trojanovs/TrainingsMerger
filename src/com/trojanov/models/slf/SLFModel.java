package com.trojanov.models.slf;

import java.util.Date;
import java.util.List;

public class SLFModel {
	private Date startDate;
	private int trainingTime;
	private int pauseTime;
	private Double distance;
	private int averageHeartrate;
	private int hrLowerLimit;
	private int hrUpperLimit;
	
	private List<LogEntry> logEntries;
	private List<Marker> markers;	
	
	public SLFModel(int trainingTime, int pauseTime,
			Double distance, int averageHeartrate, int hrLowerLimit,
			int hrUpperLimit) {
		super();
		this.trainingTime = trainingTime;
		this.pauseTime = pauseTime;
		this.distance = distance;
		this.averageHeartrate = averageHeartrate;
		this.hrLowerLimit = hrLowerLimit;
		this.hrUpperLimit = hrUpperLimit;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getTrainingTime() {
		return trainingTime;
	}
	public void setTrainingTime(int trainingTime) {
		this.trainingTime = trainingTime;
	}
	public int getPauseTime() {
		return pauseTime;
	}
	public void setPauseTime(int pauseTime) {
		this.pauseTime = pauseTime;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public int getAverageHeartrate() {
		return averageHeartrate;
	}
	public void setAverageHeartrate(int averageHeartrate) {
		this.averageHeartrate = averageHeartrate;
	}
	public int getHrLowerLimit() {
		return hrLowerLimit;
	}
	public void setHrLowerLimit(int hrLowerLimit) {
		this.hrLowerLimit = hrLowerLimit;
	}
	public int getHrUpperLimit() {
		return hrUpperLimit;
	}
	public void setHrUpperLimit(int hrUpperLimit) {
		this.hrUpperLimit = hrUpperLimit;
	}
	public List<LogEntry> getLogEntries() {
		return logEntries;
	}
	public void setLogEntries(List<LogEntry> logEntries) {
		this.logEntries = logEntries;
	}
	public List<Marker> getMarkers() {
		return markers;
	}
	public void setMarkers(List<Marker> markers) {
		this.markers = markers;
	}	
	
}
