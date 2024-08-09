package com.trek.service;

import com.trek.dto.detail.TreckDetail;

public interface TourDetailsService {
	TreckDetail getTrekDetailsById(Long tripid);
}
