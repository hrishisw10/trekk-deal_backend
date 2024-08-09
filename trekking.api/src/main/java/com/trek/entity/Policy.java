package com.trek.entity;

import java.util.ArrayList;
import java.util.List;

import com.trek.constant.PolicyType;

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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "POLICY_DETAILS")
public class Policy extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "POLICY_TYPE")
	private PolicyType policyType;

	@Column(name = "POLICY_VALUES")
	private List<String> values = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "tours_id")
	private TourDetail tours;
}
