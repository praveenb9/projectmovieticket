package com.capgemini.movieticket.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater {
	
	private int theaterId;
	private String theaterName;
	private String city;
	private String managerName;
	private String managerContact;
	 public  List<Movie> movies=new ArrayList<Movie>();
	//public  Map<Integer,Screen> listOfScreens=new HashMap<Integer,Screen>();
	 public List<Screen> listOfScreens = new ArrayList<Screen>();
	//public  List<Theater> listOfTheaters = new ArrayList<Theater>();
	public  static Map<Integer,Theater> listOfTheaters=new HashMap<Integer,Theater>();
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheatreId(int theatreId) {
		this.theaterId = theatreId;
	}
	
	public static Map<Integer, Theater> getListOfTheaters() {
		return listOfTheaters;
	}
	public static void setListOfTheaters(Map<Integer, Theater> listOfTheaters) {
		Theater.listOfTheaters = listOfTheaters;
	}
	/*public Map<Integer, String> getListOfTheaters() {
		return listOfTheaters;
	}
	public void setListOfTheaters(Map<Integer, String> listOfTheaters) {
		this.listOfTheaters = listOfTheaters;
	}*/
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	public List<Screen> getListOfScreens() {
		return listOfScreens;
	}
	public void setListOfScreens(List< Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}
	@Override
	public String toString() {
		return "TheaterName=" + theaterName + ", City=" + city + ", ManagerName=" + managerName
				+ ", managerContact=" + managerContact + ", movies=" + movies  + listOfScreens;
	}
	
}
