package com.techelevator.npgeek.dao;

import java.util.Map;

import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.Survey;

public interface SurveyDao {

	Long submitSurvey(Survey survey);
	Map<Park, Integer> getFavoriteParks();
	
}
