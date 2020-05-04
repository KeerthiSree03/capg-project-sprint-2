package com.capg.fms.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.fms.login.model.Flight;
import com.capg.fms.login.model.ScheduledFlight;

@Service
public class AdminService implements IAdminService {
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return restTemplate.postForObject("http://localhost:9085/flights/add", flight, Flight.class);
	}

	@Override
	public Flight viewFlight(long flightNumber) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject("http://localhost:9085/flights/id/"+flightNumber ,Flight.class);
	}

	@Override
	public void cancelFlight(long flightNumber) {
		// TODO Auto-generated method stub
		 restTemplate.delete("http://localhost:9085/flights/deleteById/"+flightNumber);;
	}

	@Override
	public Flight modifyFlight(Flight flight) {
		// TODO Auto-generated method stub
		return restTemplate.postForObject("http://localhost:9085/flights/modify", flight, Flight.class);
	}

	@Override
	public ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight) {
		// TODO Auto-generated method stub
		return restTemplate.postForObject("http://localhost:9500/scheduleflight/add", scheduledFlight, ScheduledFlight.class);
	}

	@Override
	public ScheduledFlight viewScheduledFlight(long scheduledFlightId) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject("http://localhost:9500/scheduleflight/id/"+scheduledFlightId, ScheduledFlight.class);
	}

	@Override
	public void cancelScheduledFlight(long  scheduledFlightId) {
		// TODO Auto-generated method stub
		restTemplate.delete("http://localhost:9500/scheduleflight/delete/"+scheduledFlightId);
	}

	@Override
	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight) {
		// TODO Auto-generated method stub
		return restTemplate.postForObject("http://localhost:9500/scheduleflight/modify", scheduledFlight , ScheduledFlight.class);
	}

}
