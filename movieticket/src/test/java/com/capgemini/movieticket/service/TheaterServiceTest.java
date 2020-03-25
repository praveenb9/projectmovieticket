package com.capgemini.movieticket.service;
// Testing for Methods - delete Theater and UserValidations
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capgemini.movieticket.bean.Theater;

class TheaterServiceTest {

	static ITheaterService serviceObject;
static Theater theaterObject;
	@BeforeAll
	public static void setUp() {
		serviceObject = new TheaterService();
		theaterObject = new Theater();
		theaterObject.setTheaterId(2367);
		theaterObject.setTheaterName("vimal");
		theaterObject.setManagerName("praveen");
		theaterObject.setManagerContact("9878987678");
	}

	@Test
	void testDeleteTheater() {
		theaterObject.setTheaterId(2765);
		Map<Integer, Theater> map = new HashMap<Integer, Theater>();
		map.put(theaterObject.getTheaterId(), theaterObject);
		theaterObject.setListOfTheaters(map);
		boolean flag = serviceObject.deleteTheater(theaterObject.getTheaterId());
		assertEquals(true, flag);

	}

	
	}


