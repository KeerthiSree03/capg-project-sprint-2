package com.capg.fms.login.model;

import java.util.List;

public class BookingList {

	private List<Booking> BookingList;

	public BookingList(List<Booking> bookingList) {
		super();
		BookingList = bookingList;
	}

	public List<Booking> getBookingList() {
		return BookingList;
	}

	public void setBookingList(List<Booking> bookingList) {
		BookingList = bookingList;
	}

	public BookingList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
