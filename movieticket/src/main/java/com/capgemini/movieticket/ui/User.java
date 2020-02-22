package com.capgemini.movieticket.ui;
// project Movie Ticket 
//Modules- Adding and Deleting Theater
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.movieticket.bean.Movie;
import com.capgemini.movieticket.bean.Screen;
import com.capgemini.movieticket.bean.Show;
import com.capgemini.movieticket.bean.Theater;
import com.capgemini.movieticket.service.ITheaterService;
import com.capgemini.movieticket.service.TheaterService;

public class User {

	public static void main(String[] args) {

		// Theater theaterobject = new Theater();
		// Screen screenobj = new Screen();
		/*
		 * Show showObject=new Show(); Movie movieObject=new Movie();
		 */
		try {
		ITheaterService serviceobject = new TheaterService();
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("Admin Accessed");
			System.out.println("you can proceed for the following actions");
			System.out.println("1. Add Theater");
			System.out.println("2. Delete Theater");
			System.out.println("3. View Theaters");
			System.out.println("4. EXIT");
			System.out.println("Choose your action");
			int action = input.nextInt();

			switch (action) {
			case 1:
				//Taking The Inputs
				Theater theaterobject = new Theater();
				Show showObject = new Show();
				Movie movieObject = new Movie();
				
					
			
				System.out.println("Adding the theater");
				System.out.println("Enter Theater Name (name should not be null)");
				String theaterName = input.next();
				System.out.println("Enter Theater ID (ID must be minimum 4 digit starting with 2)");
				int theaterId = input.nextInt();
				System.out.println("Enter The City");
				String city = input.next();
				System.out.println("Enter Manager Name(name should not be null)");
				String managerName = input.next();
				System.out.println("Enter Manager Contact(Valid 10 digit number)");
				String managerContact = input.next();
				System.out.println("Enter The Number Of Screens");
				int screens = input.nextInt();
				System.out.println("Enter the no of shows");
				int noOfShows = input.nextInt();
				System.out.println("Enter MovieName");
				String movieName = input.next();
				
				
				// setting the values for Theater class Attributes
				theaterobject.setTheaterName(theaterName);
				theaterobject.setTheatreId(theaterId);
				theaterobject.setCity(city);
				theaterobject.setManagerName(managerName);
				theaterobject.setManagerContact(managerContact);
				showObject.setNoOfShows(noOfShows);
				movieObject.setMovieName(movieName);

				boolean existId = TheaterService.existIdCheck(theaterobject); // checking for duplicate theater Id

				if (existId == true) {
					System.out.println("Theater with Id " + theaterobject.getTheaterId() + " Aleady exist");
				}
				else {

					// validations for given details
					boolean valid = TheaterService.userValidation(theaterobject);
					if (valid) {

						// adding the theater after validation

						List<Show> shows = new ArrayList<Show>();
						shows.add(showObject);

						Theater add = serviceobject.addTheater(theaterobject);//adding the theater
						theaterobject.listOfScreens.add(new Screen(screens, shows));//adding no of screens and shows
						theaterobject.movies.add(movieObject);//adding movie
						System.out.println("Theater added");
					} 
					else 
					{
						System.out.println(" Could Not Add Theater");
					}
				}
			
				
				break;
			case 2: 
			{
				
				//Deleting The Theater
				
				System.out.println("Enter The TheaterId (ID must be minimum 4 digit starting with 2)");
				int theaterId1 = input.nextInt();
				boolean validId = TheaterService.isValidTheaterId(theaterId1);
				if (validId) {
					boolean flag = serviceobject.deleteTheater(theaterId1);
					if (flag == true) {
						System.out.println("Theater With Id " + theaterId1 + " Deleted Successfully");

					} 
					else 
					{
						System.out.println("Cannot Delete Theater - Theater Is Not Present With Given Id");
					}
				} 
				else 
				{
					System.out.println("Please Enter a Valid TheaterId");
				}

				// System.out.println(Theater.listOfScreens);
				// System.out.println(TheaterDAO.listOfTheaters);
				break;
			}
			case 3:
				if(Theater.listOfTheaters.isEmpty())
				{
					System.out.println("Zero Theaters Available");
				}
				else
				{
				System.out.println("Available Theaters");
				System.out.println();
				Map<Integer,Theater> listOfTheaters=serviceobject.viewTheaters();
				Set<Integer> set = listOfTheaters.keySet();
				//System.out.println(set);
				Iterator it = set.iterator();
				while (it.hasNext()) {
					Integer key = (Integer) it.next();
					System.out.println("TheaterId - " + key + " "+ listOfTheaters.get(key));
					//System.out.println( theaterObject1.getListOfTheaters().get(key));
				}
				}
				break;
			case 4:
				System.out.println("You Are Out Of Admin Console");
				System.out.println("Login Again To Add Theaters");
				System.exit(0);
			default:
				System.out.println("Enter a Valid Choice");
				break;
			}

		}
		}
		catch(InputMismatchException e)
		{
			System.err.println(e);
		}
	}
}
