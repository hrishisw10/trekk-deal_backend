package com.trek.service;

import java.util.List;

import com.trek.dto.DashboardRecord;

public interface DashboardViewService {
	List<DashboardRecord> getToursInfo();

	// void saveTourInfo(Tours tours);
}
