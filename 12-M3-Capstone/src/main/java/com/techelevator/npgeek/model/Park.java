package com.techelevator.npgeek.model;

public class Park {

	private String code;
	private String name;
	private String state;
	private String climate;
	private String inspoQuote;
	private String inspoQuoteSrc;
	private String description;
	
	private double milesOfTrail;
	
	private Long acres;
	private Long annualVisitorCount;
	
	private int elevation;
	private int campsiteCount;
	private int yearFounded;
	private int entryFee;
	private int animalSpeciesCount;
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public String getState() {
		return state;
	}
	
	public String getClimate() {
		return climate;
	}
	
	public String getInspoQuote() {
		return inspoQuote;
	}

	public String getInspoQuoteSrc() {
		return inspoQuoteSrc;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getMilesOfTrail() {
		return milesOfTrail;
	}
	
	public Long getAcres() {
		return acres;
	}
	
	public Long getAnnualVisitorCount() {
		return annualVisitorCount;
	}
	
	public int getElevation() {
		return elevation;
	}
	
	public int getCampsiteCount() {
		return campsiteCount;
	}
	
	public int getYearFounded() {
		return yearFounded;
	}
	
	public int getEntryFee() {
		return entryFee;
	}
	
	public int getAnimalSpeciesCount() {
		return animalSpeciesCount;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setClimate(String climate) {
		this.climate = climate;
	}
	
	public void setInspoQuote(String inspoQuote) {
		this.inspoQuote = inspoQuote;
	}

	public void setInspoQuoteSrc(String inspoQuoteSrc) {
		this.inspoQuoteSrc = inspoQuoteSrc;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setMilesOfTrail(double milesOfTrail) {
		this.milesOfTrail = milesOfTrail;
	}
	
	public void setAcres(Long acres) {
		this.acres = acres;
	}
	
	public void setAnnualVisitorCount(Long annualVisitorCount) {
		this.annualVisitorCount = annualVisitorCount;
	}
	
	public void setElevation(int elevation) {
		this.elevation = elevation;
	}
	
	public void setCampsiteCount(int campsiteCount) {
		this.campsiteCount = campsiteCount;
	}
	
	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}
	
	public void setEntryFee(int entryFee) {
		this.entryFee = entryFee;
	}
	
	public void setAnimalSpeciesCount(int animalSpeciesCount) {
		this.animalSpeciesCount = animalSpeciesCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acres == null) ? 0 : acres.hashCode());
		result = prime * result + animalSpeciesCount;
		result = prime * result + ((annualVisitorCount == null) ? 0 : annualVisitorCount.hashCode());
		result = prime * result + campsiteCount;
		result = prime * result + ((climate == null) ? 0 : climate.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + elevation;
		result = prime * result + entryFee;
		result = prime * result + ((inspoQuoteSrc == null) ? 0 : inspoQuoteSrc.hashCode());
		long temp;
		temp = Double.doubleToLongBits(milesOfTrail);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + yearFounded;
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
		Park other = (Park) obj;
		if (acres == null) {
			if (other.acres != null)
				return false;
		} else if (!acres.equals(other.acres))
			return false;
		if (animalSpeciesCount != other.animalSpeciesCount)
			return false;
		if (annualVisitorCount == null) {
			if (other.annualVisitorCount != null)
				return false;
		} else if (!annualVisitorCount.equals(other.annualVisitorCount))
			return false;
		if (campsiteCount != other.campsiteCount)
			return false;
		if (climate == null) {
			if (other.climate != null)
				return false;
		} else if (!climate.equals(other.climate))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (elevation != other.elevation)
			return false;
		if (entryFee != other.entryFee)
			return false;
		if (inspoQuoteSrc == null) {
			if (other.inspoQuoteSrc != null)
				return false;
		} else if (!inspoQuoteSrc.equals(other.inspoQuoteSrc))
			return false;
		if (Double.doubleToLongBits(milesOfTrail) != Double.doubleToLongBits(other.milesOfTrail))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (yearFounded != other.yearFounded)
			return false;
		return true;
	}
}
