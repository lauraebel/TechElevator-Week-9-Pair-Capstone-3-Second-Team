package com.techelevator.npgeek.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.model.Forecast;

@Component
public class JDBCWeatherDao implements WeatherDao {

	private JdbcTemplate jdbc;
	
	public JDBCWeatherDao(DataSource dataSource) {
		this.jdbc = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Forecast> getForecast(String parkCode) {
		
		List<Forecast> forecasts = new ArrayList<Forecast>();
		
		String sql = "";
		
		SqlRowSet results = jdbc.queryForRowSet(sql);
		
		while (results.next()) {
			Forecast forecast = mapForecastFromResults(results);
			
			forecasts.add(forecast);
		}
		
		
		return forecasts;
	}

	
	private Forecast mapForecastFromResults(SqlRowSet results) {
		Forecast forecast = new Forecast();
		
		forecast.setWeatherType(results.getString(columnLabel));
		forecast.setHigh(results.getInt(columnLabel));
		forecast.setLow(results.getInt(columnLabel));
		
		forecast.setImgPath(getWeatherImage(forecast.getWeatherType()));
		
		return forecast;
	}
	
	private String getWeatherImage(String weatherType) {
		
		SqlRowSet results = "";
		
		
		
		return null;
	}
}
