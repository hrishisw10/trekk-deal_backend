package com.trek.dto.detail;

import java.util.List;
import java.util.Map;

public class TreckDetail {

	private List<String> images;
	private String name;
	private String location;
	private List<String> highlights;
	private TrekOverview overView;
	private Map<String, List<String>> faqs;
	private Policies policies;
	private TrekMap map;

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<String> getHighlights() {
		return highlights;
	}

	public void setHighlights(List<String> highlights) {
		this.highlights = highlights;
	}

	public TrekOverview getOverView() {
		return overView;
	}

	public void setOverView(TrekOverview overView) {
		this.overView = overView;
	}

	public Map<String, List<String>> getFaqs() {
		return faqs;
	}

	public void setFaqs(Map<String, List<String>> faqs) {
		this.faqs = faqs;
	}

	public Policies getPolicies() {
		return policies;
	}

	public void setPolicies(Policies policies) {
		this.policies = policies;
	}

	public TrekMap getMap() {
		return map;
	}

	public void setMap(TrekMap map) {
		this.map = map;
	}

}
