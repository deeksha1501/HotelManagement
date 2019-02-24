package com.WebApp.HotelMngmnt.HotelManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotels")
public class Hotel {
	
	@Id
	@Column(name="hotelid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int hotelid;
	@Column(name="hotelname")
	private String hotelName;
	@Column(name="hoteladdress")
	private String hotelAddress;
	@Column(name="hotelcity")
	private String city;
	@Column(name="hotelrating")
	private int hotelStarRating;
	
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", hotelAddress=" + hotelAddress + ", city=" + city
				+ ", hotelStarRating=" + hotelStarRating + "]";
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getHotelStarRating() {
		return hotelStarRating;
	}
	public void setHotelStarRating(int hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}
	public void addExtra()
	{
		String name=null;
		name=hotelName+"_Arpit";
		print(name);
	
	}
	public void print(String name)
	{
		this.hotelName=name;
		System.out.println(hotelName+"_"+hotelStarRating);
	}
}
