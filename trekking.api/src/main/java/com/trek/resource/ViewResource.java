package com.trek.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trek.dto.detail.TreckDetail;
import com.trek.service.TourDetailsService;

@RestController
@RequestMapping("/v1/view")
public class ViewResource {

	@Autowired
	TourDetailsService tourDetailsService;

	@GetMapping("/detail/{tripid}")
	public ResponseEntity<TreckDetail> getTreckDetails(@PathVariable(required = true) Long tripid) {

		return new ResponseEntity<>(tourDetailsService.getTrekDetailsById(tripid), HttpStatus.OK);
	}
}
//https://www.thrillophilia.com/tours/day-trek-to-kalsubai-igatpuri