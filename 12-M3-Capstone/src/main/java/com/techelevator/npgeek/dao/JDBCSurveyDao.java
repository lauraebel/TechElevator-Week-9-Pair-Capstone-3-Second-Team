package com.techelevator.npgeek.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.model.Survey;

@Component
public class JDBCSurveyDao implements SurveyDao {

	private JdbcTemplate jdbc;
	
	public JDBCSurveyDao(DataSource dataSource) {
		this.jdbc = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void submitSurvey(Survey survey) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Integer> getFavoriteParks() {
		// TODO Auto-generated method stub
		return null;
	}

}
