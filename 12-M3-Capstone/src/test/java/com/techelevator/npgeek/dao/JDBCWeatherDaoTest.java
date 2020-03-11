package com.techelevator.npgeek.dao;

import java.util.List;

import org.junit.*;

import com.techelevator.DAOIntegrationTest;
import com.techelevator.npgeek.model.Forecast;

public class JDBCWeatherDaoTest extends DAOIntegrationTest {

	private WeatherDao dao;
	
	@Before
	public void setup() {
		dao = new JDBCWeatherDao(super.getDataSource());
	}
	
	@Test
	public void existing_park_code_gets_5_results() {
		List<Forecast> forecasts = dao.getForecast("GTNP");
		
		Assert.assertEquals(5, forecasts.size());
	}
	
	@Test
	public void no_results_from_nonexistent_park_code() {
		List<Forecast> forecasts = dao.getForecast("MDK");
		
		Assert.assertEquals(0, forecasts.size());
	}
	
	@Test
	public void cloudy_img_assigned_correctly() {
		List<Forecast> forecasts = dao.getForecast("GTNP");
		
		for (Forecast forecast : forecasts) {
			if (forecast.getWeatherType().equalsIgnoreCase("cloudy")) {
				Assert.assertEquals("cloudy.png", forecast.getImgPath());
			}
		}
	}
	
	@Test
	public void partly_cloudy_img_assigned_correctly() {
		List<Forecast> forecasts = dao.getForecast("GTNP");
		
		for (Forecast forecast : forecasts) {
			if (forecast.getWeatherType().equalsIgnoreCase("partly cloudy")) {
				Assert.assertEquals("partlyCloudy.png", forecast.getImgPath());
			}
		}
	}
	
	@Test
	public void rain_img_assigned_correctly() {
		List<Forecast> forecasts = dao.getForecast("RMNP");
		
		for (Forecast forecast : forecasts) {
			if (forecast.getWeatherType().equalsIgnoreCase("rain")) {
				Assert.assertEquals("rain.png", forecast.getImgPath());
			}
		}
	}
	
	@Test
	public void snow_img_assigned_correctly() {
		List<Forecast> forecasts = dao.getForecast("MRNP");
		
		for (Forecast forecast : forecasts) {
			if (forecast.getWeatherType().equalsIgnoreCase("snow")) {
				Assert.assertEquals("snow.png", forecast.getImgPath());
			}
		}
	}
	
	@Test
	public void sunny_img_assigned_correctly() {
		List<Forecast> forecasts = dao.getForecast("YNP");
		
		for (Forecast forecast : forecasts) {
			if (forecast.getWeatherType().equalsIgnoreCase("sunny")) {
				Assert.assertEquals("sunny.png", forecast.getImgPath());
			}
		}
	}
	
	@Test
	public void thunderstorms_img_assigned_correctly() {
		List<Forecast> forecasts = dao.getForecast("GSMNP");
		
		for (Forecast forecast : forecasts) {
			if (forecast.getWeatherType().equalsIgnoreCase("thunderstorms")) {
				Assert.assertEquals("thunderstorms.png", forecast.getImgPath());
			}
		}
	}
	
}
