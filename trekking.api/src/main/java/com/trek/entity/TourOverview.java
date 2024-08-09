package com.trek.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
@Table(name = "TOUR_OVERVIEW")
public class TourOverview extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "ACTIVITY_LOCATION")
	private String activityLocation;

	@Column(name = "REGION")
	private String trekRegion;

	@Column(name = "STARTING_POINT")
	private String startingPoint;

	@Column(name = "PICKUP_LOCATIONS")
	private List<String> pickUpLocations = new ArrayList<>();

	@Column(name = "TOTAL_DURATION")
	private String totalDuration;

	@Column(name = "TREK_DURATION")
	private String trekDuration;

	@Column(name = "SUMMIT_HEIGHT")
	private String summitHeight;

	@Column(name = "DISTANCE")
	private String trekDistance;

	@Column(name = "DIFFICULTY_LEVEL")
	private String trekDifficultyLevel;

	@Column(name = "TREK_ATTRACTION")
	private String attractionsDuringTrek;

	@Column(name = "ACTIVITY")
	private List<String> activities = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "tours_id", nullable = false)
	private TourDetail tours;
}
