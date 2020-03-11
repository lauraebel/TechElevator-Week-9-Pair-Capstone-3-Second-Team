package com.techelevator.npgeek.model;

public class Forecast {

	private String forecast;
	private String imgPath;
	
	private int high;
	private int low;
	private int forecastDay;
	
	public String getForecast() {
		return forecast;
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
	
	public int getForecastDay() {
		return forecastDay;
	}
	
	public void setForecast(String forecast) {
		this.forecast = forecast;
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
	
	public void setForecastDay(int forecastDay) {
		this.forecastDay = forecastDay;
	}
}
