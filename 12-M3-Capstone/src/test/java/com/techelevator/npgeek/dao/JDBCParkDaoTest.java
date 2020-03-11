package com.techelevator.npgeek.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.*;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.DAOIntegrationTest;
import com.techelevator.npgeek.model.Park;

public class JDBCParkDaoTest extends DAOIntegrationTest {

	private ParkDao dao;
	
	@Before
	public void setup() {
		dao = new JDBCParkDao(super.getDataSource());
	}
	
	@Test
	public void get_parks_pulls_all_parks_in_table() {
		
		List<Park> parks = dao.getParks();
		
		Assert.assertEquals(10, parks.size());
		
	}
	
	@Test
	public void parks_returned_have_all_attributes() {
		
		List<Park> parks = dao.getParks();
		
		for (Park park : parks) {
			Assert.assertNotNull(park.getCode());
			Assert.assertNotNull(park.getName());
			Assert.assertNotNull(park.getState());
			Assert.assertNotNull(park.getClimate());
			Assert.assertNotNull(park.getInspoQuote());
			Assert.assertNotNull(park.getInspoQuoteSrc());
			Assert.assertNotNull(park.getDescription());
			
			Assert.assertNotNull(park.getMilesOfTrail());
			
			Assert.assertNotNull(park.getAcres());
			Assert.assertNotNull(park.getAnnualVisitorCount());
			
			Assert.assertNotNull(park.getElevation());
			Assert.assertNotNull(park.getCampsiteCount());
			Assert.assertNotNull(park.getYearFounded());
			Assert.assertNotNull(park.getEntryFee());
			Assert.assertNotNull(park.getAnimalSpeciesCount());
		}
	}

	
	@Test
	public void get_park_by_existing_uppercase_code_pulls_correct_park() {
		Park actual = dao.getParkByCode("YNP");
		
		Assert.assertEquals("YNP", actual.getCode());
		Assert.assertEquals("Yellowstone National Park", actual.getName());
		Assert.assertEquals("Wyoming", actual.getState());
		Assert.assertEquals("Temperate", actual.getClimate());
		Assert.assertEquals("Yellowstone Park is no more representative of America than is Disneyland.", actual.getInspoQuote());
		Assert.assertEquals("John Steinbeck", actual.getInspoQuoteSrc());
		Assert.assertEquals("", actual.getDescription());
		
		Assert.assertEquals(, actual.getMilesOfTrail());
		
		Assert.assertEquals( , actual.getAcres());
		Assert.assertEquals( , actual.getAnnualVisitorCount());
		
		Assert.assertEquals( , actual.getElevation());
		Assert.assertEquals( , actual.getCampsiteCount());
		Assert.assertEquals( , actual.getYearFounded());
		Assert.assertEquals( , actual.getEntryFee());
		Assert.assertEquals( , actual.getAnimalSpeciesCount());
	}
}
