package com.ag.rent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ag.rent.domain.Booking;
import com.ag.rent.repository.BookingRepository;

@Service
public class BookingService {

	private BookingRepository bookingRepository;
	
	@Autowired
	public BookingService(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}
	
	public List<Booking> getAllBookings(){
		return this.bookingRepository.findAll();
	}
}
