package com.ag.rent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ag.rent.domain.Booking;
import com.ag.rent.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	public BookingService bookingService;
	
	@GetMapping("/bookings")
	public List<Booking> getAllBookings() {
		return bookingService.getAllBookings();
	}
}
