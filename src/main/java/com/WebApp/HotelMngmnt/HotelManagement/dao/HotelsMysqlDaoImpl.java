package com.WebApp.HotelMngmnt.HotelManagement.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Repository;

import com.WebApp.HotelMngmnt.HotelManagement.models.Hotel;
import com.WebApp.HotelMngmnt.HotelManagement.models.Rooms;
import com.WebApp.HotelMngmnt.HotelManagement.models.response.HotelRoomMapping;

@Repository
public class HotelsMysqlDaoImpl implements HotelsDao {

	@Override
	public List<Hotel> getHotelsList() throws SQLException {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriver(new com.mysql.jdbc.Driver());
		dataSource.setUrl("jdbc:mysql://localhost:3306/hotelmanagement");
		dataSource.setUsername("deeksha");
		dataSource.setPassword("password");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		String sqlSelect = "SELECT * FROM hotels";

		List<Hotel> listHotel = jdbcTemplate.query(sqlSelect, new RowMapper<Hotel>() {

			@Override
			public Hotel mapRow(ResultSet result, int rowNum) throws SQLException {
				Hotel hotel = new Hotel();
				hotel.setHotelName(result.getString("hotelname"));
				hotel.setHotelAddress(result.getString("hoteladdress"));
				hotel.setCity(result.getString("hotelcity"));
				hotel.setHotelStarRating(result.getInt("hotelrating"));
				return hotel;
			}

		});
		/*
		 * for (Contact aContact : listContact) { System.out.println(aContact); }
		 * 
		 * String sqlDelete = "DELETE FROM contact1 where name=?";
		 * jdbcTemplate.update(sqlDelete, "Tom");
		 * 
		 */
		return listHotel;

	}

	@Override
	public List<Rooms> getRoomList(String hotelName, String city) throws SQLException {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriver(new com.mysql.jdbc.Driver());
		dataSource.setUrl("jdbc:mysql://localhost:3306/hotelmanagement");
		dataSource.setUsername("deeksha");
		dataSource.setPassword("password");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		/*
		 * String sqlSelect =
		 * "SELECT hotels.hotelname,hotels.hotelcity,rooms.roomNumber,rooms.statusOfRoom\r\n"
		 * + "FROM hotels \r\n" + "INNER JOIN rooms\r\n" +
		 * "ON hotels.hotelid = rooms.hotelid where rooms.statusOfRoom='available'";
		 */
		String sqlSelect = "SELECT rooms.*\r\n"
				+ "FROM hotels \r\n" + "INNER JOIN rooms\r\n"
				+ "ON hotels.hotelid = rooms.hotelid where hotels.hotelname='" + hotelName + "' OR hotels.hotelcity='"
				+ city + "' AND rooms.statusOfRoom='available'";

		System.out.println(sqlSelect);

		List<Rooms> listHotel = jdbcTemplate.query(sqlSelect, new RowMapper<Rooms>() {

			@Override
			public Rooms mapRow(ResultSet result, int rowNum) throws SQLException {
				Hotel hotel = new Hotel();
				Rooms rooms = new Rooms();
				//hotel.setHotelName(result.getString("hotelname"));
				// hotel.setHotelAddress(result.getString("hoteladdress"));
				//hotel.setCity(result.getString("hotelcity"));
				// hotel.setHotelStarRating(result.getInt("hotelrating"));
				rooms.setStatusOfRooms(result.getString("statusOfRoom"));
				rooms.setRoomNumber(result.getInt("roomNumber"));
				rooms.setRoomPrice(result.getInt("roomPrice"));
				rooms.setRoomTypes(result.getString("roomTypes"));
				
				System.out.println(rooms);
				System.out.println(hotel);
				
				
				return rooms;
			}

		});
		/*
		 * for (Contact aContact : listContact) { System.out.println(aContact); }
		 * 
		 * String sqlDelete = "DELETE FROM contact1 where name=?";
		 * jdbcTemplate.update(sqlDelete, "Tom");
		 * 
		 */
		return listHotel;
	}
}
