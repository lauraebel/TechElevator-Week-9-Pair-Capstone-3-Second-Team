package com.techelevator.npgeek.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.Survey;

@Component
public class JDBCSurveyDao implements SurveyDao {

	private JdbcTemplate jdbc;
	
	public JDBCSurveyDao(DataSource dataSource) {
		this.jdbc = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Long submitSurvey(Survey survey) {
		
		String sql = "INSERT INTO survey_result("
								+ "surveyid, "
								+ "parkcode, "
								+ "emailaddress, "
								+ "state, "
								+ "activitylevel) "
					+ "VALUES (DEFAULT, ?, ?, ?, ?) "
					+ "RETURNING surveyid";
		
		SqlRowSet results = jdbc.queryForRowSet(
												sql, 
												survey.getFavoriteParkCode(), 
												survey.getEmail(), 
												survey.getState(), 
												survey.getActivityLevel()
												);
		results.next();
		
		return results.getLong("surveyid");
	}

	@Override
	public Map<Park, Integer> getFavoriteParks() {
		Map<Park, Integer> favoriteParks = new LinkedHashMap<Park, Integer>();
		
		String sql = "SELECT COUNT(survey_result.parkcode) AS surveycount, park.* "
				+ "FROM park "
				+ "JOIN survey_result "
					+ "ON park.parkcode = survey_result.parkcode "
				+ "GROUP BY park.parkcode "
				+ "ORDER BY surveycount DESC, park.parkname;";
		
		SqlRowSet results = jdbc.queryForRowSet(sql);
		
		while(results.next()) {
			Park park = mapParkFromResults(results);
			
			favoriteParks.put(park, results.getInt("surveycount"));
		}
		
		return favoriteParks;
	}
	
	private Park mapParkFromResults(SqlRowSet results) {
		Park park = new Park();
		
		park.setCode(results.getString("parkcode"));
		park.setName(results.getString("parkname"));
		park.setState(results.getString("state"));
		park.setClimate(results.getString("climate"));
		park.setInspoQuote(results.getString("inspirationalquote"));
		park.setInspoQuoteSrc(results.getString("inspirationalquotesource"));
		park.setDescription(results.getString("parkdescription"));
		
		park.setAcres(results.getLong("acreage"));
		park.setAnnualVisitorCount(results.getLong("annualvisitorcount"));
		
		park.setElevation(results.getInt("elevationinfeet"));
		park.setCampsiteCount(results.getInt("numberofcampsites"));
		park.setYearFounded(results.getInt("yearfounded"));
		park.setEntryFee(results.getInt("entryfee"));
		park.setAnimalSpeciesCount(results.getInt("numberofanimalspecies"));
		park.setMilesOfTrail((int)results.getDouble("milesoftrail"));
		
		return park;
	}

}
