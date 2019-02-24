package com.WebApp.HotelMngmnt.HotelManagement.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Repository;

import com.WebApp.HotelMngmnt.HotelManagement.models.Hotel;
import com.WebApp.HotelMngmnt.HotelManagement.models.Rooms;
import com.WebApp.HotelMngmnt.HotelManagement.models.response.HotelRoomMapping;

@Repository
public class HotelsDaoImpl implements HotelsDao {

	@Override
	public List<Hotel> getHotelsList() {

		List<Hotel> list = new ArrayList<Hotel>();
		Hotel hotel1 = new Hotel();
		Hotel hotel2 = new Hotel();
		hotel1.setCity("Agra");
		hotel1.setHotelAddress("Express way");
		hotel1.setHotelName("Taj");
		hotel1.setHotelStarRating(4);

		hotel2.setCity("Delhi");
		hotel2.setHotelAddress("South Delhi");
		hotel2.setHotelName("Taj-Delhi");
		hotel2.setHotelStarRating(4);

		list.add(hotel1);
		list.add(hotel2);

		return list;

	}

	/*
	 * @Override public List<Hotel> getRoomList() { // TODO Auto-generated method
	 * stub return null; }
	 */
	@Override
	public List<Rooms> getRoomList(String hotelName, String city) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
