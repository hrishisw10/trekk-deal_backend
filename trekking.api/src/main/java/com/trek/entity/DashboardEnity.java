package com.trek.entity;

import java.util.List;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TRIP_DASHBOARD_VIEW")
@Immutable
@Subselect("SELECT\r\n"
		+ "TOUR_DETAILS.ID AS TRIP_ID,\r\n"
		+ "TOUR_DETAILS.NAME AS TRIP_TITLE,\r\n"
		+ "TOUR_DETAILS.PRICE AS PRICE,\r\n"
		+ "TOUR_DETAILS.WHATSAPP_CONNECT_URL AS WHATSAPP_CONNECT_URL,\r\n"
		+ "TOUR_DETAILS.IMAGES AS IMAGES_URL,\r\n"
		+ "TOUR_DETAILS.TOUR_TYPES AS TOUR_TYPES,\r\n"
		+ "TOUR_OVERVIEW.TOTAL_DURATION AS DAYS\r\n"
		+ "FROM TOUR_DETAILS\r\n"
		+ "JOIN TOUR_OVERVIEW ON TOUR_DETAILS.ID=TOUR_OVERVIEW.TOURS_ID")
public class DashboardEnity {

	@Id
	@Column(name = "TRIP_ID")
	private Long id;

	@Column(name = "TRIP_TITLE")
	private String title;

	@Column(name = "WHATSAPP_CONNECT_URL")
	private String whatsappConnURL;

	@Column(name = "IMAGES_URL")
	private List<String> imagesURLs;

	@Column(name = "DAYS")
	private String days;

	@Column(name = "TOUR_TYPES")
	private String type;

	@Column(name = "PRICE")
	private double price;

}
