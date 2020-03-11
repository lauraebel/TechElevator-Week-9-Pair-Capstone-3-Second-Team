package com.techelevator.npgeek;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class NPController {

	@RequestMapping(path="/", method = RequestMethod.GET)
	public String displayHomePage() {
	
		return "homePage";
	}
	
	@RequestMapping(path="/parkDetails", method = RequestMethod.GET)
	public String displayParkDetails() {
	
		return "parkDetails";
	}
	
	@RequestMapping(path="/survey", method = RequestMethod.GET)
	public String displaySurvey() {
	
		return "survey";
	}
	
	@RequestMapping(path="/survey", method = RequestMethod.POST)
	public String submitSurvey() {
		
		return "redirect:/favoriteParks";
	}
	
	
	@RequestMapping(path="/favoriteParks", method = RequestMethod.GET)
	public String displayFavoritePars() {
	
		return "favoriteParks";
	}


}
