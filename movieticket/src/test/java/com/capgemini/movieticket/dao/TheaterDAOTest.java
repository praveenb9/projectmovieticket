package com.capgemini.movieticket.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capgemini.movieticket.bean.Theater;
import com.capgemini.movieticket.service.ITheaterService;
import com.capgemini.movieticket.service.TheaterService;

class TheaterDAOTest {


	static ITheaterDAO serviceObject;
static Theater theaterObject;
	@BeforeAll
	public static void setUp() {
		serviceObject = new TheaterDAO();
		theaterObject = new Theater();
		theaterObject.setTheaterId(2367);
		theaterObject.setTheaterName("vimal");
		theaterObject.setManagerName("praveen");
		theaterObject.setManagerContact("9878987678");
	}
	@Test
	void testAddTheater() {
		Theater newobject=serviceObject.addTheater(theaterObject);
		//System.out.println(newobject);
		assertEquals(theaterObject, newobject);
	}

}
