package com.WebApp.HotelMngmnt.HotelManagement.dao;

import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.WebApp.HotelMngmnt.HotelManagement.models.Hotel;
import com.WebApp.HotelMngmnt.HotelManagement.models.Rooms;

@Repository
@Transactional
@Primary
public class HotelsHibernateDaoImpl implements HotelsDao {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Hotel> getHotelsList() {
		
		try {
		 session = this.sessionFactory.getCurrentSession();
		}
		catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		List<Hotel> hotelList = session.createQuery("from Hotel").list();
		return hotelList;
	}

	@Override
	public List<Rooms> getRoomList(String hotelName, String city) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
