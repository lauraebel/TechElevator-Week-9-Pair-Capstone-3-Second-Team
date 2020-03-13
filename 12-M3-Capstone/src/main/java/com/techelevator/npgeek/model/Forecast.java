package com.techelevator.npgeek.model;

import java.time.LocalDate;

public class Forecast {

	private String weatherType;
	private String imgPath;
	
	private int fHigh;
	private int fLow;
	
	private int cHigh;
	private int cLow;
	
	public String getWeatherType() {
		return weatherType;
	}
	
	public String getImgPath() {
		return imgPath;
	}
	
	public int getfHigh() {
		return fHigh;
	}

	public int getfLow() {
		return fLow;
	}

	public void setfHigh(int fHigh) {
		this.fHigh = fHigh;
	}

	public void setfLow(int fLow) {
		this.fLow = fLow;
	}

	public int getcHigh() {
		return cHigh;
	}
	
	public int getcLow() {
		return cLow;
	}
	
	public void setWeatherType(String weatherType) {
		this.weatherType = weatherType;
	}
	
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	public void setFHigh(int high) {
		this.fHigh = high;
		
		double celHigh = (fHigh - 32) * ((double)5/9);
		this.cHigh = (int) celHigh;
	}
	
	public void setFLow(int low) {
		this.fLow = low;
		
		double celLow = (fLow - 32) * ((double)5/9);
		this.cLow = (int) celLow;
	}

	public LocalDate getForecastDate(Long days) {
		return LocalDate.now().plusDays(days);
	}

}
