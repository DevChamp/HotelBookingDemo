package com.hotel.booking.repository;

import org.springframework.data.repository.CrudRepository;

import com.hotel.booking.model.Image;


public interface ImageRepository extends CrudRepository<Image, Long> {
	
}

