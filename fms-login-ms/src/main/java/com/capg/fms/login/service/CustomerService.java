package com.capg.fms.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.fms.login.model.Booking;
import com.capg.fms.login.model.BookingList;
import com.capg.fms.login.model.FlightList;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public FlightList checkAvailableFlights() {
		
		return restTemplate.getForObject("http://localhost:9085/flights/all", FlightList.class);
	}
 
	@Override
	public Booking makeBooking(Booking booking) {
		
		return restTemplate.postForObject("http://localhost:9999/booking/add",booking, Booking.class);
		
	}
    
	@Override
	public BookingList viewBookingList() {
		// TODO Auto-generated method stub
		return restTemplate.getForObject("http://localhost:9999/booking/all", BookingList.class);
	}

	@Override
	public void cancelBooking(long bookingId) {
	
		 restTemplate.delete("http://localhost:9999/booking/delete/"+bookingId);
	}

	@Override
	public Booking modifyBooking(Booking booking) {
	
		return restTemplate.postForObject("http://localhost:9999/booking/modify", booking, Booking.class);
	}
	

}
