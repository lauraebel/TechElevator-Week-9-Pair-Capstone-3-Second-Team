package com.techelevator.npgeek.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Survey {

	@NotBlank
	private String favoriteParkCode;
	
	@Email
	private String email;
	
	@NotBlank
	private String state;
	
	@NotBlank
	private String activityLevel;
	
	public String getFavoriteParkCode() {
		return favoriteParkCode;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getState() {
		return state;
	}
	
	public String getActivityLevel() {
		return activityLevel;
	}
	
	public void setFavoriteParkCode(String favoriteParkCode) {
		this.favoriteParkCode = favoriteParkCode;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setActivityLevel(String activityLevel) {
		this.activityLevel = activityLevel;
	}
}
