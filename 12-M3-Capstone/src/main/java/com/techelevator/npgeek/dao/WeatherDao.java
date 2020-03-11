package com.techelevator.npgeek.dao;

import java.util.List;

import com.techelevator.npgeek.model.Forecast;

public interface WeatherDao {

	List<Forecast> getForecast(String parkCode);
	
}
