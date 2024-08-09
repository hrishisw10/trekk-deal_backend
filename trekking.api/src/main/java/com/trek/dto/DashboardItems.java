package com.trek.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DashboardItems {
	private String trekId;
	private String trekTitle;
	private String whatsappConnURL;
	private String imagesURLs;
	private String days;
	private double price;
}
