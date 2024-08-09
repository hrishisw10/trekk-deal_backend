package com.trek.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.trek.constant.AddressTypes;
import com.trek.constant.PolicyType;
import com.trek.constant.TrekConstant;
import com.trek.dto.detail.AddressMap;
import com.trek.dto.detail.DropPoint;
import com.trek.dto.detail.PickupPoint;
import com.trek.dto.detail.Policies;
import com.trek.dto.detail.StartingPoint;
import com.trek.dto.detail.TreckDetail;
import com.trek.dto.detail.TrekMap;
import com.trek.dto.detail.TrekOverview;
import com.trek.entity.FrequentlyAskedQuestions;
import com.trek.entity.Policy;
import com.trek.entity.TourDetail;
import com.trek.entity.TourOverview;
import com.trek.entity.TrekAddress;
import com.trek.exception.TourDetailsException;
import com.trek.repository.TourDetailsRepository;
import com.trek.repository.TourOverviewRepository;
import com.trek.service.TourDetailsService;

@Service
public class TourDetailsServiceImpl implements TourDetailsService {

	@Autowired
	TourDetailsRepository tourDetailsRepository;

	@Autowired
	TourOverviewRepository tourOverviewRepository;

	@Override
	public TreckDetail getTrekDetailsById(Long tripid) {
		TreckDetail treckDetail = new TreckDetail();

		TourDetail trekDeatilsDb = tourDetailsRepository.findById(tripid).orElse(null);

		if (Objects.nonNull(trekDeatilsDb)) {
			treckDetail.setImages(setIamges(trekDeatilsDb));
			treckDetail.setName(trekDeatilsDb.getName());
			treckDetail.setLocation(trekDeatilsDb.getLocation());
			treckDetail.setHighlights(setHighlights(trekDeatilsDb));
			treckDetail.setOverView(setOverView(trekDeatilsDb));
			treckDetail.setFaqs(setFaqs(trekDeatilsDb));
			treckDetail.setPolicies(setPolicies(trekDeatilsDb));
			treckDetail.setMap(setMaps(trekDeatilsDb));
		} else {
			throw new TourDetailsException(HttpStatus.NOT_FOUND, "TREK_001", TrekConstant.TREK_001);
		}

		return treckDetail;
	}

	private TrekOverview setOverView(TourDetail trekDeatilsDb) {

		TrekOverview trekOverview = new TrekOverview();

		TourOverview tourOverview = trekDeatilsDb.getTourOverview();

		trekOverview.setActivityLocation(tourOverview.getActivityLocation());
		trekOverview.setTrekRegion(tourOverview.getTrekRegion());
		trekOverview.setStartingPoint(tourOverview.getStartingPoint());
		trekOverview.setPickUpLocations(setPickupLocations(tourOverview));
		trekOverview.setTotalDuration(tourOverview.getTotalDuration());
		trekOverview.setTreckDuration(tourOverview.getTrekDuration());
		trekOverview.setSummitHeight(tourOverview.getSummitHeight());
		trekOverview.setTrekDistance(tourOverview.getTrekDistance());
		trekOverview.setTrekDifficultyLevel(tourOverview.getTrekDifficultyLevel());
		trekOverview.setAttractionsDuringTrek(tourOverview.getAttractionsDuringTrek());
		trekOverview.setAboutActivity(setAboutActivity(tourOverview));

		return trekOverview;
	}

	private List<String> setPickupLocations(TourOverview tourOverview) {
		List<String> pickupLocations = new ArrayList<>();
		pickupLocations.addAll(tourOverview.getPickUpLocations());
		return pickupLocations;
	}

	private List<String> setAboutActivity(TourOverview tourOverview) {
		List<String> activities = new ArrayList<>();
		activities.addAll(tourOverview.getActivities());
		return activities;
	}

	private TrekMap setMaps(TourDetail trekDeatilsDb) {

		TrekMap trekMap = new TrekMap();

		List<TrekAddress> trekAddressList = trekDeatilsDb.getTrekAddress();

		//@formatter:off
        List<TrekAddress> startingPoints = trekAddressList.stream().filter(list->
                                           list.getAddressType().equals(AddressTypes.STARTING))
                                          .collect(Collectors.toList());

        List<TrekAddress> pickupPoints = trekAddressList.stream().filter(list->
                                            list.getAddressType().equals(AddressTypes.PICKUP))
                                            .collect(Collectors.toList());

        List<TrekAddress> dropPoints = trekAddressList.stream().filter(list->
                                            list.getAddressType().equals(AddressTypes.DROP))
                                            .collect(Collectors.toList());
        //@formatter:on

		StartingPoint startingPoint = getStartingPoint(startingPoints);
		trekMap.setStartingPoint(startingPoint);
		PickupPoint pickupPoint = getPickupPoint(pickupPoints);
		trekMap.setPickupPoints(pickupPoint);
		DropPoint dropPoint = getDropPoint(dropPoints);
		trekMap.setDropPoints(dropPoint);

		return trekMap;
	}

	private DropPoint getDropPoint(List<TrekAddress> dropPoints) {

		List<AddressMap> addressMaps = new ArrayList<>();
		DropPoint dropPoint = new DropPoint();

		for (TrekAddress trekAddress : dropPoints) {

			AddressMap addressMap = new AddressMap();

			addressMap.setTitle(trekAddress.getPlace());
			addressMap.setLocationURL(trekAddress.getUrl());
			addressMap.setName(trekAddress.getLocation());
			addressMap.setState(trekAddress.getState());
			addressMap.setPin(trekAddress.getPincode());
			addressMap.setCountry(trekAddress.getCountry());

			addressMaps.add(addressMap);
		}
		dropPoint.setDropPoints(addressMaps);
		return dropPoint;
	}

	private static PickupPoint getPickupPoint(List<TrekAddress> pickupPoints) {

		List<AddressMap> addressMaps = new ArrayList<>();
		PickupPoint pickupPoint = new PickupPoint();

		for (TrekAddress trekAddress : pickupPoints) {

			AddressMap addressMap = new AddressMap();

			addressMap.setTitle(trekAddress.getPlace());
			addressMap.setLocationURL(trekAddress.getUrl());
			addressMap.setName(trekAddress.getLocation());
			addressMap.setState(trekAddress.getState());
			addressMap.setPin(trekAddress.getPincode());
			addressMap.setCountry(trekAddress.getCountry());

			addressMaps.add(addressMap);
		}
		pickupPoint.setPickupPoints(addressMaps);
		return pickupPoint;
	}

	private static StartingPoint getStartingPoint(List<TrekAddress> startingPoints) {

		List<AddressMap> addressMaps = new ArrayList<>();
		StartingPoint startingPoint = new StartingPoint();

		for (TrekAddress trekAddress : startingPoints) {

			AddressMap addressMap = new AddressMap();

			addressMap.setTitle(trekAddress.getPlace());
			addressMap.setLocationURL(trekAddress.getUrl());
			addressMap.setName(trekAddress.getLocation());
			addressMap.setState(trekAddress.getState());
			addressMap.setPin(trekAddress.getPincode());
			addressMap.setCountry(trekAddress.getCountry());

			addressMaps.add(addressMap);
		}
		startingPoint.setStartingPoints(addressMaps);
		return startingPoint;
	}

	private List<String> setHighlights(TourDetail trekDeatilsDb) {
		List<String> highlights = new ArrayList<>();
		highlights.addAll(trekDeatilsDb.getHighlights());
		return highlights;
	}

	private Map<String, List<String>> setFaqs(TourDetail trekDeatilsDb) {

		List<FrequentlyAskedQuestions> faqList = new ArrayList<>();
		faqList.addAll(trekDeatilsDb.getFaqs());

		Map<String, List<String>> faqMap = new HashMap<>();

		for (FrequentlyAskedQuestions faq : faqList) {
			faqMap.put(faq.getQuestion(), faq.getAns());
		}
		return faqMap;
	}

	private List<String> setIamges(TourDetail trekDeatilsDb) {
		List<String> images = new ArrayList<>();
		images.addAll(trekDeatilsDb.getImages());
		return images;
	}

	private Policies setPolicies(TourDetail treckDetaildb) {
		Policies policies = new Policies();

		List<Policy> policyList = treckDetaildb.getPolices();

		for (Policy policy : policyList) {
			if (policy.getPolicyType().equals(PolicyType.BOOKING)) {
				Map<String, List<String>> bookingPolicyMap = new HashMap<>();
				bookingPolicyMap.put("Booking Policy", policy.getValues());
				policies.setBooking(bookingPolicyMap);
			} else if (policy.getPolicyType().equals(PolicyType.CANCELLATION)) {
				Map<String, List<String>> cancellationPolicyMap = new HashMap<>();
				cancellationPolicyMap.put("Cancellation Policy", policy.getValues());
				policies.setCancellation(cancellationPolicyMap);
			} else if (policy.getPolicyType().equals(PolicyType.CONFIRMATION)) {
				Map<String, List<String>> confirmPolicyMap = new HashMap<>();
				confirmPolicyMap.put("Confirmation Policy", policy.getValues());
				policies.setConfirm(confirmPolicyMap);
			} else if (policy.getPolicyType().equals(PolicyType.PAYMENT_TERMS_CONFIDATION)) {
				Map<String, List<String>> paymentTermPolicyMap = new HashMap<>();
				paymentTermPolicyMap.put("Payment Terms Policy", policy.getValues());
				policies.setPaymentTermPolicy(paymentTermPolicyMap);
			} else if (policy.getPolicyType().equals(PolicyType.REFUND)) {
				Map<String, List<String>> refundPolicyMap = new HashMap<>();
				refundPolicyMap.put("Refund Policy", policy.getValues());
				policies.setRefund(refundPolicyMap);
			}

		}
		return policies;
	}
}
