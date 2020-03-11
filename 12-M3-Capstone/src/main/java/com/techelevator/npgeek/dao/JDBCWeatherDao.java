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
		
		String sql = "SELECT low, high, forecast FROM weather WHERE parkcode = ? ORDER BY fivedayforecastvalue";
		
		SqlRowSet results = jdbc.queryForRowSet(sql, parkCode);
		
		while (results.next()) {
			Forecast forecast = mapForecastFromResults(results);
			
			forecasts.add(forecast);
		}
		
		return forecasts;
	}

	
	private Forecast mapForecastFromResults(SqlRowSet results) {
		Forecast forecast = new Forecast();
		
		forecast.setWeatherType(results.getString("forecast"));
		forecast.setHigh(results.getInt("high"));
		forecast.setLow(results.getInt("low"));
		
		forecast.setImgPath(getWeatherImage(forecast.getWeatherType()));
		
		return forecast;
	}
	
	private String getWeatherImage(String weatherType) {
		
		String sql = "SELECT imgpath FROM weather_img WHERE name = ?";
		
		SqlRowSet results = jdbc.queryForRowSet(sql, weatherType.toLowerCase());
		results.next();
		
		return results.getString("imgpath");
	}
}
