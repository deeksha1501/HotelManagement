package com.WebApp.HotelMngmnt.HotelManagement.service;

import java.sql.SQLException;
import java.util.List;

import com.WebApp.HotelMngmnt.HotelManagement.models.Hotel;
import com.WebApp.HotelMngmnt.HotelManagement.models.Rooms;
import com.WebApp.HotelMngmnt.HotelManagement.models.response.HotelRoomMapping;

public interface HotelService {

	public List<Hotel> getHotelList();

	public List<Rooms> getRoomList(String hotelName, String city) throws SQLException;
}
