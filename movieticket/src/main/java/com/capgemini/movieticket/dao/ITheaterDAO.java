package com.capgemini.movieticket.dao;

import java.util.Map;

import com.capgemini.movieticket.bean.Theater;

public interface ITheaterDAO {
	Theater addTheater(Theater object);
	boolean  deleteTheater(int theaterId);
 Map<Integer, Theater> viewTheaters();
}
