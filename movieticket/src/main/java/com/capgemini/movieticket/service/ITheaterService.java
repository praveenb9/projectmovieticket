package com.capgemini.movieticket.service;

import java.util.Map;

import com.capgemini.movieticket.bean.Theater;

public interface ITheaterService {

	Theater addTheater(Theater object);
	boolean  deleteTheater(int theaterId);
	 Map<Integer, Theater> viewTheaters();

}
