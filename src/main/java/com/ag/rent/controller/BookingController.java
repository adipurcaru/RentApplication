package com.ag.rent.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ag.rent.domain.Booking;
import com.ag.rent.exception.GenericApiException;
import com.ag.rent.service.BookingService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	public BookingService bookingService;
	
	@GetMapping
	public List<Booking> getAllBookings() {
		return bookingService.getAllBookings();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Booking> getById(@PathVariable("id") Long id) {
		Optional<Booking> bookingOpt = bookingService.findById(id);
		
		if(bookingOpt.isPresent()) {
			return ResponseEntity.ok(bookingOpt.get());
		}else {
			throw new GenericApiException("400", "Booking was not found!");
		}
		
		 
	}
	
	@PostMapping
	public ResponseEntity<String> addBooking(@RequestBody Booking booking) {
		booking.setCreated_dt(new Date());
		booking.setCreated_by("test");
		this.bookingService.addBooking(booking);
		
		return ResponseEntity.ok("Booking sucessfully created");
	}
}
