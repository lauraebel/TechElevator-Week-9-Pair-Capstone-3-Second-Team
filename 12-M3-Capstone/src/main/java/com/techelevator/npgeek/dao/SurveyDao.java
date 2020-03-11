package com.techelevator.npgeek.dao;

import java.util.Map;

import com.techelevator.npgeek.model.Survey;

public interface SurveyDao {

	void submitSurvey(Survey survey);
	
	Map<String, Integer> getFavoriteParks();
}
