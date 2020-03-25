package com.capgemini.movieticket.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.capgemini.movieticket.bean.Movie;
import com.capgemini.movieticket.bean.Theater;

public class TheaterDAO implements ITheaterDAO {
	
	// Adding the theater and no of screens

	Theater theaterObject1=new Theater();
	Movie movieObject1=new Movie();
	Movie movieObject2=new Movie();
	public static Map<Integer,Theater> listOfTheaters=new HashMap<Integer,Theater>();	
	public Theater addTheater(Theater theaterObject2) {
		//Theater object = null;
		Theater flag=listOfTheaters.put(theaterObject2.getTheaterId(), theaterObject2);
		/*
		 * if (flag == null) { object = theaterObject2;
		 * 
		 * }
		 */
		return theaterObject2;
	}

	
	
	// Deleting the theater

	public boolean deleteTheater(int theaterId) {
		
		boolean flag = false;
		Theater delete =listOfTheaters.remove(theaterId);

		
		if (delete != null) {
			flag = true;
		}

		return flag;
	}

	public  Map<Integer, Theater>  viewTheaters() {
	
		return listOfTheaters;

	}



	public static Map<Integer, Theater> getListOfTheaters() {
		return listOfTheaters;
	}



	public static void setListOfTheaters(Map<Integer, Theater> listOfTheaters) {
		TheaterDAO.listOfTheaters = listOfTheaters;
	}

}
