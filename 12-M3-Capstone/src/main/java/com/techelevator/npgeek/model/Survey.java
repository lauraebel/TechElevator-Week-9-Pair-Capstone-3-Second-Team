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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activityLevel == null) ? 0 : activityLevel.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((favoriteParkCode == null) ? 0 : favoriteParkCode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Survey other = (Survey) obj;
		if (activityLevel == null) {
			if (other.activityLevel != null)
				return false;
		} else if (!activityLevel.equals(other.activityLevel))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (favoriteParkCode == null) {
			if (other.favoriteParkCode != null)
				return false;
		} else if (!favoriteParkCode.equals(other.favoriteParkCode))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
}
