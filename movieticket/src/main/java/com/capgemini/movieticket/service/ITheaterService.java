package com.capgemini.movieticket.service;

import com.capgemini.movieticket.bean.Theater;

public interface ITheaterService {

	Theater addTheater(Theater object);
	boolean  deleteTheater(int theaterId);
	 void viewTheaters(Theater object);

}
