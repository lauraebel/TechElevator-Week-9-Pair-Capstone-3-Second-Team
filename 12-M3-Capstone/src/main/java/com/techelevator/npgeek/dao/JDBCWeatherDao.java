package com.techelevator.npgeek.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
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
		// TODO Auto-generated method stub
		return null;
	}

}
