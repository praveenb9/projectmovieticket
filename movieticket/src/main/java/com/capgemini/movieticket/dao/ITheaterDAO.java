package com.capgemini.movieticket.dao;

import com.capgemini.movieticket.bean.Theater;

public interface ITheaterDAO {
	Theater addTheater(Theater object);
	boolean  deleteTheater(int theaterId);
 void viewTheaters(Theater object);
}
