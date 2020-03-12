package com.techelevator.npgeek.model;

public class Forecast {

	private String weatherType;
	private String imgPath;
	
	private int fHigh;
	private int fLow;
	
	public String getWeatherType() {
		return weatherType;
	}
	
	public String getImgPath() {
		return imgPath;
	}
	
	public int getFHigh() {
		return fHigh;
	}
	
	public int getFLow() {
		return fLow;
	}
	
	public int getCHigh() {
		double cHigh = (fHigh - 32) * ((double)5/9);
		
		return (int) cHigh;
	}
	
	public int getCLow() {
		double cLow = (fLow - 32) * ((double)5/9);
		return (int) cLow;
	}
	
	public void setWeatherType(String weatherType) {
		this.weatherType = weatherType;
	}
	
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	public void setFHigh(int high) {
		this.fHigh = high;
	}
	
	public void setFLow(int low) {
		this.fLow = low;
	}
}
