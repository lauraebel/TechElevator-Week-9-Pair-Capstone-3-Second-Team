package com.techelevator.npgeek.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.npgeek.model.Park;

@Component
public class JDBCParkDao implements ParkDao {

	private JdbcTemplate jdbc;
	
	public JDBCParkDao(DataSource dataSource) {
		this.jdbc = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Park> getParks() {
		List<Park> parks = new ArrayList<Park>();
		
		String sql = "SELECT parkcode, "
						+ "parkname, "
						+ "state, "
						+ "acreage, "
						+ "elevationinfeet, "
						+ "milesoftrail, "
						+ "numberofcampsites, "
						+ "climate, "
						+ "yearfounded, "
						+ "annualvisitorcount, "
						+ "inspirationalquote, "
						+ "inspirationalquotesource, "
						+ "parkdescription, "
						+ "entryfee, "
						+ "numberofanimalspecies "
					+ "FROM park "
					+ "ORDER BY parkname";
		
		SqlRowSet results = jdbc.queryForRowSet(sql);
		
		while (results.next()) {
			Park park = mapParkFromResults(results);
			parks.add(park);
		}
		
		return parks;
	}

	@Override
	public Park getParkByCode(String parkCode) {
		
		String sql = "SELECT parkcode, "
						+ "parkname, "
						+ "state, "
						+ "acreage, "
						+ "elevationinfeet, "
						+ "milesoftrail, "
						+ "numberofcampsites, "
						+ "climate, "
						+ "yearfounded, "
						+ "annualvisitorcount, "
						+ "inspirationalquote, "
						+ "inspirationalquotesource, "
						+ "parkdescription, "
						+ "entryfee, "
						+ "numberofanimalspecies "
					+ "FROM park "
					+ "WHERE parkcode = ? "
					+ "ORDER BY parkname";
		
		SqlRowSet results = jdbc.queryForRowSet(sql, parkCode.toUpperCase());
		results.next();
		
		return mapParkFromResults(results);
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
