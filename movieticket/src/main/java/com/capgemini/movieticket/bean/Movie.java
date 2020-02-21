package com.capgemini.movieticket.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Movie {
	/*private int movieId;
	private String movieName;
	private List<Show> movieGenre=new ArrayList<Show>();
	private String movieDirector;
	private int movieLength;
	private List<String> languages = new ArrayList<String>();
	private LocalDate movieReleaseDate; 
*/
	
	private String movieName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "movieName=" + movieName ;
	}

}
