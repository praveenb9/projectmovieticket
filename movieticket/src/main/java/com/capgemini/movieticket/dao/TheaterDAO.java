package com.capgemini.movieticket.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.capgemini.movieticket.bean.Theater;

public class TheaterDAO implements ITheaterDAO {

	// public static List<Theater> listOfTheaters = new ArrayList<Theater>();
	// User userObject=new User();
	// Screen screenobject=new Screen();
//Show showObject=new Show();
	
	
	// Adding the theater and no of screens

	Theater theaterObject1=new Theater();
	
	
	public Theater addTheater(Theater theaterObject2) {
		Theater obj = null;

		Theater flag=theaterObject2.listOfTheaters.put(theaterObject2.getTheaterId(), theaterObject2);

		// boolean flag=theaterObject2.listOfTheaters.add(theaterObject2);
		//Map<Integer,Theater> map=new HashMap<Integer,Theater>();
		//map.put(theaterObject2.getTheaterId(), theaterObject2);
		//String flag=theaterObject2.listOfTheaters.put(theaterObject2.getTheaterId(), theaterObject2.getTheaterName());
		//Theater flag=theaterObject2.listOfTheaters.put(theaterObject2.getTheaterId(), theaterObject2);
		// theaterObject1.setListOfTheaters(map);
		//screenobject.setShowList(showObject);
		// System.out.println(flag);

		if (flag == null) {
			obj = theaterObject2;

		}
		return obj;
	}

	// Deleting the theater

	public boolean deleteTheater(int theaterId) {
		// listOfTheaters.remove(theaterId);
		boolean flag = false;
		Theater delete =theaterObject1.listOfTheaters.remove(theaterId);

		//Theater delete = theaterObject1.listOfTheaters.remove(theaterId);
		//Theater delete =theaterObject1.listOfTheaters.remove(theaterId);
		//Theater delete = theaterObject1.listOfTheaters.remove(theaterId);
		//System.out.println(delete);
		
		
		if (delete != null) {
			flag = true;
		}

		// System.out.println(Theater.listOfTheaters);

		return flag;
	}

	public  Map<Integer, Theater>  viewTheaters() {
	
		return Theater.getListOfTheaters();

	}

}
