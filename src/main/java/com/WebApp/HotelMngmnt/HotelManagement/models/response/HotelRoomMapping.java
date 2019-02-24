package com.WebApp.HotelMngmnt.HotelManagement.models.response;

import com.WebApp.HotelMngmnt.HotelManagement.models.Hotel;
import com.WebApp.HotelMngmnt.HotelManagement.models.Rooms;

public class HotelRoomMapping {

	private Hotel hotel;
	private Rooms room;
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Rooms getRoom() {
		return room;
	}
	public void setRoom(Rooms room) {
		this.room = room;
	}
	
	
	
}
