package com.ag.rent.service;

import java.util.List;
import java.util.Optional;

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
	
	public void addBooking(Booking booking) {
		this.bookingRepository.save(booking);
	}
	
	public Optional<Booking> findById(Long id) {
		return this.bookingRepository.findById(id);
	}
}
