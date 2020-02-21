package com.capgemini.movieticket.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capgemini.movieticket.bean.Theater;

class TheaterServiceTest {

	static ITheaterService serviceObject;
	@BeforeAll
	public static void setUp()
	{
		serviceObject=new TheaterService();
		
	}
	
	@Test
	void testDeleteTheater() {
		Theater theaterObject=new Theater();
theaterObject.setTheatreId(2765);
Map<Integer,Theater> map=new HashMap<Integer,Theater>();
map.put(theaterObject.getTheaterId(),theaterObject);
theaterObject.setListOfTheaters(map);
boolean flag=serviceObject.deleteTheater(theaterObject.getTheaterId());
assertEquals(true, flag);
	}
	@Test
	void testUserValidation() {
		
		Theater theaterObject=new Theater();
		theaterObject.setTheatreId(2367);
		theaterObject.setTheaterName("vimal");
		theaterObject.setManagerName("praveen");
		theaterObject.setManagerContact("9878987678");
		boolean flag=TheaterService.userValidation(theaterObject);
		
		assertEquals(true, flag);
	}

}
