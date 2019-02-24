package com.WebApp.HotelMngmnt.HotelManagement.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.WebApp.HotelMngmnt.HotelManagement.models.Hotel;
import com.WebApp.HotelMngmnt.HotelManagement.models.Rooms;
import com.WebApp.HotelMngmnt.HotelManagement.models.response.HotelRoomMapping;
import com.WebApp.HotelMngmnt.HotelManagement.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelsController {

	@Autowired
	private HotelService hotelService;
	private String hotelName;
	private String city;

	@GetMapping("/welcome")
	public String printWelcome() {
		return "Welcome to our Hotel TAJ";
	}

	@GetMapping("/showHotels")
	public List<Hotel> showAllHotels() {
		return hotelService.getHotelList();
	}
	
	@GetMapping("/showHotelsWithCapital")
	public List<Hotel> showHotelsWithCapital() {
		return hotelService.getHotelList();
	}
	
	@PostMapping(path ="/getRoomAvailablityStatus",produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
	public List<Rooms> getRoomAvailablityStatus(@RequestParam(value = "hotelName") String hotelName, @RequestParam(value = "city") String city) throws SQLException {
		this.hotelName=hotelName;
		this.city=city;
		System.out.println(hotelService.getRoomList(hotelName,city).toString()+"deeksha");
		return hotelService.getRoomList(hotelName,city);
	}
	
}
