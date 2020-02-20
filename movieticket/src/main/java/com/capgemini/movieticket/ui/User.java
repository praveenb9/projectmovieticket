package com.capgemini.movieticket.ui;

import java.util.Scanner;

import com.capgemini.movieticket.bean.Movie;
import com.capgemini.movieticket.bean.Screen;
import com.capgemini.movieticket.bean.Show;
import com.capgemini.movieticket.bean.Theater;
import com.capgemini.movieticket.service.ITheaterService;
import com.capgemini.movieticket.service.TheaterService;

public class User {

	public static void main(String[] args) {

		Theater theaterobject = new Theater();
		// Screen screenobj = new Screen();
		Show showObject=new Show();
Movie movieObject=new Movie();
		ITheaterService serviceobject = new TheaterService();
		Scanner input = new Scanner(System.in);
		while (true) {
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
				System.out.println("Adding the theater");
				System.out.println("Enter Theater Name (name should not be null)");
				String theaterName = input.next();
				System.out.println("Enter Theater ID (ID must be minimum 4 digit starting with 2)");
				int theaterId = input.nextInt();
				System.out.println("Enter The City");
				String city = input.next();
				System.out.println("Enter Manager Name(name should not be null)");
				String managerName = input.next();
				System.out.println("Enter Manager Contact");
				String managerContact = input.next();
				System.out.println("Enter The Number Of Screens");
				int screens = input.nextInt();
				System.out.println("Enter the no of shows");
				int noOfShows=input.nextInt();
				System.out.println("Enter MovieName");
				String movieName=input.next();
				// screenobj.setNumberOfScreens(Screens);
			
				// System.out.println(screenobj.getNumberOfScreens());

				// Setting the values for theater attributes

				theaterobject.setTheaterName(theaterName);
				theaterobject.setTheatreId(theaterId);
				theaterobject.setCity(city);
				theaterobject.setManagerName(managerName);
				theaterobject.setManagerContact(managerContact);
				showObject.setNoOfShows(noOfShows);
				movieObject.setMovieName(movieName);
				//movieObject.setMovieName(movieName);;
				// validations for details
				boolean valid = TheaterService.userValidation(theaterobject);
				if (valid) {

					// adding the theater after validation
					
				//	Screen screenobj = new Screen(screens);
					
					//Screen screenObj = new Screen();
					
				//	screenObj.setNumberOfScreens(screens);
					
					Theater add = serviceobject.addTheater(theaterobject);
					
					//theaterobject.listOfScreens.put(theaterobject.getTheaterId(), new Screen(screens));
					theaterobject.listOfScreens.add(new Screen(screens));
					theaterobject.movies.add(movieObject);
					System.out.println("Theater With Id " + add + " Is Added");
					//System.out.println(theaterobject.listOfScreens);
				} else {
					System.out.println(" Could Not Add Theater");
				}

				break;
			case 2: {
				System.out.println("Enter The TheaterId");
				int theaterId1 = input.nextInt();
				boolean flag = serviceobject.deleteTheater(theaterId1);
				if (flag == true) {
					System.out.println("Theater With Id " + theaterId1 + " Deleted Successfully");

				} else {
					System.out.println("Theater Not Deleted");
				}

				// System.out.println(Theater.listOfScreens);
				// System.out.println(TheaterDAO.listOfTheaters);
				break;
			}
			case 3:
				/*for (Theater lst : Theater.listOfTheaters) {
					System.out.println(lst);
				}*/
				System.out.println("Available Theaters");
				//System.out.println(theaterobject);
				
				System.out.println("next from view theaters method");
				serviceobject.viewTheaters(theaterobject);
				break;

			default:
				break;
			}

		}

	}
}
