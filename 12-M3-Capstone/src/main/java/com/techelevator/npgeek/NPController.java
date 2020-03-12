package com.techelevator.npgeek;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.model.SignUp;
import com.techelevator.npgeek.dao.ParkDao;
import com.techelevator.npgeek.dao.SurveyDao;
import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.Survey;

@Controller
public class NPController {

	@Autowired
	private ParkDao parkDao;

	@Autowired
	SurveyDao surveyDao;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String displayHomePage(ModelMap map) {
		List<Park> parkList = parkDao.getParks();

		map.addAttribute("parks", parkList);
		return "homePage";
	}

	@RequestMapping(path = "/parkDetails", method = RequestMethod.GET)
	public String displayParkDetails(ModelMap map, @RequestParam String parkCode) {

		Park park = parkDao.getParkByCode(parkCode);
		map.addAttribute("park", park);

		return "parkDetails";
	}

	@RequestMapping(path="/survey")
	public String displaySurvey(ModelMap map) {
		List<Park> parkList = parkDao.getParks();
		String[] statesArray = {"Alabama", "Alaska", "American Samoa", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia", "Guam", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Minor Outlying Islands", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Northern Mariana Islands", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Puerto Rico", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "U.S. Virgin Islands", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
		map.addAttribute("parks", parkList);
		map.addAttribute("states", statesArray);
		
		if(! map.containsAttribute("survey")) {
			map.addAttribute("survey", new Survey());
		}
	
		return "survey";
	}

	@RequestMapping(path = "/submit", method = RequestMethod.POST)
	public String submitSurvey(@Valid @ModelAttribute("survey") Survey survey, BindingResult result) {
		
		if (result.hasErrors()) {
			return "survey";
		} else {
			Survey survey = map.get
		}

		return "redirect:/favoriteParks";
	}

	@RequestMapping(path = "/favoriteParks", method = RequestMethod.GET)
	public String displayFavoritePars() {

		return "favoriteParks";
	}

}
