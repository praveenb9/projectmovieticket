package com.capgemini.movieticket.bean;

public class Show {

	private int noOfShows;

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	@Override
	public String toString() {
		return  ""+ noOfShows;
	}
}
