package com.techelevator.npgeek.model;

import org.junit.*;

public class ForecastTest {

	private Forecast forecast;
	
	@Before
	public void setup() {
		forecast = new Forecast();
	}
	
	@Test
	public void calculates_high_temp_in_celsius_correctly() {
		forecast.setFHigh(71);
		
		Assert.assertEquals(21 ,forecast.getcHigh());
	}
	
	@Test
	public void calculates_low_temp_in_celsius_correctly() {
		forecast.setFLow(48);
		
		Assert.assertEquals(8, forecast.getcLow());
	}
}
