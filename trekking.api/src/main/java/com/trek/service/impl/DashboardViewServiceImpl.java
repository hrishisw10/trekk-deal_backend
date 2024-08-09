package com.trek.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trek.dto.DashboardItems;
import com.trek.dto.DashboardRecord;
import com.trek.entity.DashboardEnity;
import com.trek.repository.DashboardRepository;
import com.trek.service.DashboardViewService;

@Service
public class DashboardViewServiceImpl implements DashboardViewService {

	@Autowired
	private DashboardRepository dashboardRepository;

	@Override
	public List<DashboardRecord> getToursInfo() {
		List<DashboardEnity> dashboardEnities = dashboardRepository.findAll();
		List<DashboardRecord> records = new LinkedList<>();
		List<DashboardItems> itemsList1 = new LinkedList<>();
		dashboardEnities.stream().sorted(Comparator.comparing(DashboardEnity::getType)).forEach(p -> {
			if (!records.isEmpty()) {
				boolean matchFlag = false;
				for (DashboardRecord rec : records) {
					if (rec.getType().equalsIgnoreCase(p.getType())) {
						matchFlag = true;
						DashboardItems item = new DashboardItems(String.valueOf(p.getId()), p.getTitle(),
								p.getWhatsappConnURL(), p.getImagesURLs().get(0), p.getDays(), p.getPrice());
						rec.getTrips().add(item);
					}
				}
				if (!matchFlag) {
					List<DashboardItems> itemsList2 = new LinkedList<>();
					itemsList2.add(new DashboardItems(String.valueOf(p.getId()), p.getTitle(), p.getWhatsappConnURL(),
							p.getImagesURLs().get(0), p.getDays(), p.getPrice()));
					records.add(new DashboardRecord(p.getType(), itemsList2));
				}
			} else {
				itemsList1.add(new DashboardItems(String.valueOf(p.getId()), p.getTitle(), p.getWhatsappConnURL(),
						p.getImagesURLs().get(0), p.getDays(), p.getPrice()));
				records.add(new DashboardRecord(p.getType(), itemsList1));
			}
		});
		return records;
	}

	/*	@Override
	public void saveTourInfo(Tours tours) {
		saveTourType(tours);
		saveTrips(tours);
	}

	private void saveTrips(Tours tours) {
		List<Trip> trips = tours.getTrips();
		final List<TripEntity> tripList = new LinkedList<>();
		if (!CollectionUtils.isEmpty(trips)) {
			trips.forEach(trip -> {
				TripEntity tripEntity = new TripEntity();
				tripEntity.setTripTitle(trip.getTripTitle());
				tripEntity.setDays(trip.getDays());
				tripEntity.setPrice(trip.getPrice());
				tripEntity.setViewDetails(trip.getViewDetails());

				tripList.add(tripEntity);
			});

			tripRepository.saveAll(tripList);
		}
	}

	private void saveTourType(Tours tours) {
		ToursEntity tourEntity = new ToursEntity();
		if (Objects.nonNull(tours)) {
			tourEntity.setToursType(tours.getToursType());
		}
		toursRepository.save(tourEntity);
	}*/
}