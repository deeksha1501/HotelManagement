package com.WebApp.HotelMngmnt.HotelManagement.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebApp.HotelMngmnt.HotelManagement.dao.HotelsDao;
import com.WebApp.HotelMngmnt.HotelManagement.models.Hotel;
import com.WebApp.HotelMngmnt.HotelManagement.models.Rooms;
import com.WebApp.HotelMngmnt.HotelManagement.models.response.HotelRoomMapping;
import com.WebApp.HotelMngmnt.HotelManagement.service.HotelService;

@Service
public class HotelsServiceImpl implements HotelService {

	@Autowired
	private HotelsDao hotelsDao;
	String hotelName;
	String city;
	
	@Override
	
	public List<Hotel> getHotelList() {
		List<Hotel> list;
		List<Hotel> updatedList = null;
		try {
			list = hotelsDao.getHotelsList();

			updatedList = new ArrayList<Hotel>(list.size());

			for (Hotel h1 : list) {
				String name = h1.getHotelName();
				String uppercaseName = name.toUpperCase();
				h1.setHotelName(uppercaseName);
				updatedList.add(h1);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updatedList;

	}

	@Override
	public List<Rooms> getRoomList(String hotelName, String city) throws SQLException {
		List<Rooms> list;
		this.hotelName=hotelName;
		this.city=city;
		list=hotelsDao.getRoomList(hotelName,city);
		return list;
	}

	/*public List<Hotel> getRoomList(String hotelName, String city) {
		List<Hotel> list;
		list=hotelsDao.getRoomList();
		return list;*/
	//}

}
