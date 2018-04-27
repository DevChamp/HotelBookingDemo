package com.hotel.booking.repository;

import org.springframework.data.repository.CrudRepository;

import com.hotel.booking.model.Booking;


public interface BookingRepository extends CrudRepository<Booking, Long> {
	
}

