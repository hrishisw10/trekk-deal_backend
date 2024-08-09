package com.trek.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "TOUR_DETAILS")
public class TourDetail extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "LOCATION")
	private String location;

	@Column(name = "HIGHLIGHTS")
	private List<String> highlights = new ArrayList<>();

	@Column(name = "IMAGES")
	private List<String> images = new ArrayList<>();

	@Column(name = "PRICE")
	private double price;

	@Column(name = "WHATSAPP_CONNECT_URL")
	private String whatsappConnectUrl;

	@Column(name = "TOUR_TYPES")
	private String type;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TOUR_OVERVIEW_ID", referencedColumnName = "id")
	private TourOverview tourOverview;

	@OneToMany(mappedBy = "tours", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<TrekAddress> trekAddress = new ArrayList<>();

	@OneToMany(mappedBy = "tours", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Policy> polices = new ArrayList<>();

	@OneToMany(mappedBy = "tours", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<FrequentlyAskedQuestions> faqs = new ArrayList<>();
}
