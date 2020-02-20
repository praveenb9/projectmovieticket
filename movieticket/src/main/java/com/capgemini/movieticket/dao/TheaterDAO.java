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

		// boolean flag=theaterObject2.listOfTheaters.add(theaterObject2);
		//Map<Integer,Theater> map=new HashMap<Integer,Theater>();
		//map.put(theaterObject2.getTheaterId(), theaterObject2);
		String flag=theaterObject2.listOfTheaters.put(theaterObject2.getTheaterId(), theaterObject2.getTheaterName());
		// theaterObject1.setListOfTheaters(map);
		//screenobject.setShowList(showObject);

		 //System.out.println(flag);

		if (flag == null) {
			obj = theaterObject2;

		}
		 
		 /*if (flag == true) {
				obj = theaterObject2;

			} 
		 */
		// System.out.println(obj);
		// putting into map <Integer,Screen>
		// Theater.listOfScreens.put(object.getTheaterId(),screenobject);
		// Theater.listOfScreens.put(object.getTheaterId(),new Screen());

		return obj;
	}

	// Deleting the theater

	public boolean deleteTheater(int theaterId) {
		// listOfTheaters.remove(theaterId);
		boolean flag = false;

		// Set<Integer> set = Theater.listOfTheaters.keySet();

		// System.out.println(Theater.listOfTheaters);

		//Theater delete = theaterObject1.listOfTheaters.remove(theaterId);
		String delete =theaterObject1.listOfTheaters.remove(theaterId);
		//Theater delete = theaterObject1.listOfTheaters.remove(theaterId);
		
		//System.out.println(delete);
		if (delete != null) {
			flag = true;
		}

		// System.out.println(Theater.listOfTheaters);

		return flag;
	}

	public void viewTheaters(Theater object) {
	
		Set<Integer> set = theaterObject1.listOfTheaters.keySet();
		//System.out.println(set);
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("TheaterId - " + key + " " + " TheaterName - " + theaterObject1.listOfTheaters.get(key));
			//System.out.println( theaterObject1.getListOfTheaters().get(key));

		}
		
	}

}
