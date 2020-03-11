package com.techelevator.npgeek;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.npgeek.dao.ParkDao;
import com.techelevator.npgeek.model.Park;


@Controller
public class NPController {
	
	@Autowired
	private ParkDao parkDao;

	@RequestMapping(path="/", method = RequestMethod.GET)
	public String displayHomePage(ModelMap map) {
		List<Park> parkList = parkDao.getParks();
		
		map.addAttribute("parks", parkList);
		return "homePage";
	}
	
	@RequestMapping(path="/parkDetails", method = RequestMethod.GET)
	public String displayParkDetails(ModelMap map, @RequestParam String parkCode) {
		
		Park park = parkDao.getParkByCode(parkCode);
		map.addAttribute("park",park);
	
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
