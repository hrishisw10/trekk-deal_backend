package com.trek.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trek.dto.DashboardRecord;
import com.trek.service.DashboardViewService;

@RestController
@RequestMapping("/v1/dashboard")
public class DashboardResource {

	@Autowired
	private DashboardViewService dashboardViewService;

	@GetMapping("/treks")
	public ResponseEntity<List<DashboardRecord>> getHomeInfo() {

		return new ResponseEntity<>(dashboardViewService.getToursInfo(), HttpStatus.OK);
	}

	/*    @PostMapping("/save/trips")
    public String saveEventInfo(@RequestBody Tours tours) {
        dashboardService.saveTourInfo(tours);
        return "Data saved succesfully ";
    }*/
}
