package com.hotel.booking.repository;

import org.springframework.data.repository.CrudRepository;

import com.hotel.booking.model.RoomType;


public interface RoomTypeRepository extends CrudRepository<RoomType, Long> {
	
	
}

