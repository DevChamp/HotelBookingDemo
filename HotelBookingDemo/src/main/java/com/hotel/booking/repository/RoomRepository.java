package com.hotel.booking.repository;

import org.springframework.data.repository.CrudRepository;

import com.hotel.booking.model.Room;


public interface RoomRepository extends CrudRepository<Room, Long> {
	
	
}

