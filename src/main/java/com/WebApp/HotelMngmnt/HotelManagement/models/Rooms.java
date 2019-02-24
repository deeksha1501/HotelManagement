package com.WebApp.HotelMngmnt.HotelManagement.models;

public class Rooms {

	private int roomId;
	private int roomNumber;
	private String roomTypes;
	private int roomPrice;
	private String statusOfRooms;
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomTypes() {
		return roomTypes;
	}
	public void setRoomTypes(String roomTypes) {
		this.roomTypes = roomTypes;
	}
	public int getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	public String getStatusOfRooms() {
		return statusOfRooms;
	}
	public void setStatusOfRooms(String statusOfRooms) {
		this.statusOfRooms = statusOfRooms;
	}
	@Override
	public String toString() {
		return "Rooms [roomId=" + roomId + ", roomNumber=" + roomNumber + ", roomTypes=" + roomTypes + ", roomPrice="
				+ roomPrice + ", statusOfRooms=" + statusOfRooms + "]";
	}
	
	
}
