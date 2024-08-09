package com.trek.dto.detail;

import java.util.List;

public class TrekOverview {
	public String activityLocation;
	public String trekRegion;
	public String startingPoint;
	public List<String> pickUpLocations;
	public String totalDuration;
	public String treckDuration;
	public String summitHeight;
	public String trekDistance;
	public String trekDifficultyLevel;
	public String attractionsDuringTrek;
	public List<String> aboutActivity;

	public String getActivityLocation() {
		return activityLocation;
	}

	public void setActivityLocation(String activityLocation) {
		this.activityLocation = activityLocation;
	}

	public String getTrekRegion() {
		return trekRegion;
	}

	public void setTrekRegion(String trekRegion) {
		this.trekRegion = trekRegion;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public List<String> getPickUpLocations() {
		return pickUpLocations;
	}

	public void setPickUpLocations(List<String> pickUpLocations) {
		this.pickUpLocations = pickUpLocations;
	}

	public String getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(String totalDuration) {
		this.totalDuration = totalDuration;
	}

	public String getTreckDuration() {
		return treckDuration;
	}

	public void setTreckDuration(String treckDuration) {
		this.treckDuration = treckDuration;
	}

	public String getSummitHeight() {
		return summitHeight;
	}

	public void setSummitHeight(String summitHeight) {
		this.summitHeight = summitHeight;
	}

	public String getTrekDistance() {
		return trekDistance;
	}

	public void setTrekDistance(String trekDistance) {
		this.trekDistance = trekDistance;
	}

	public String getTrekDifficultyLevel() {
		return trekDifficultyLevel;
	}

	public void setTrekDifficultyLevel(String trekDifficultyLevel) {
		this.trekDifficultyLevel = trekDifficultyLevel;
	}

	public String getAttractionsDuringTrek() {
		return attractionsDuringTrek;
	}

	public void setAttractionsDuringTrek(String attractionsDuringTrek) {
		this.attractionsDuringTrek = attractionsDuringTrek;
	}

	public List<String> getAboutActivity() {
		return aboutActivity;
	}

	public void setAboutActivity(List<String> aboutActivity) {
		this.aboutActivity = aboutActivity;
	}

}
