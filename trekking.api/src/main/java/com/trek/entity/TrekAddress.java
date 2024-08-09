package com.trek.entity;

import com.trek.constant.AddressTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "TREK_ADDRESS")
public class TrekAddress extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "PLACE")
	private String place;

	@Column(name = "LOCATION")
	private String location;

	@Column(name = "LANDMARK")
	private String landmark;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "ADDRESS_TYPE")
	private AddressTypes addressType;

	@Column(name = "URL")
	private String url;

	@Column(name = "PRIORITY")
	private String priority;

	@Column(name = "PIN")
//	@Size(min = 6, max = 6)
	private int pincode;

	@Column(name = "STATE")
	private String state;

	@Column(name = "COUNTRY")
	private String country;

	@ManyToOne
	@JoinColumn(name = "tours_id")
	private TourDetail tours;
}
