package com.WebApp.HotelMngmnt.HotelManagement.dao;

import java.sql.SQLException;
import java.util.List;

import com.WebApp.HotelMngmnt.HotelManagement.models.Hotel;
import com.WebApp.HotelMngmnt.HotelManagement.models.Rooms;

public interface HotelsDao {

	public List<Hotel> getHotelsList() throws SQLException;

	public List<Rooms> getRoomList(String hotelName,String city) throws SQLException;
	
}
