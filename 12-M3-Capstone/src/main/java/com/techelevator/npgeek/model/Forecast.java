package com.techelevator.npgeek.model;

public class Forecast {

	private String weatherType;
	private String imgPath;
	
	private int high;
	private int low;
	
	public String getWeatherType() {
		return weatherType;
	}
	
	public String getImgPath() {
		return imgPath;
	}
	
	public int getHigh() {
		return high;
	}
	
	public int getLow() {
		return low;
	}
	
	public void setWeatherType(String weatherType) {
		this.weatherType = weatherType;
	}
	
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	public void setHigh(int high) {
		this.high = high;
	}
	
	public void setLow(int low) {
		this.low = low;
	}
}
