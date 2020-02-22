package com.capgemini.movieticket.service;

import java.util.Map;

import com.capgemini.movieticket.bean.Theater;
import com.capgemini.movieticket.dao.ITheaterDAO;
import com.capgemini.movieticket.dao.TheaterDAO;
import com.capgemini.movieticket.exception.InValidIdException;
import com.capgemini.movieticket.exception.InValidNameException;

public class TheaterService implements ITheaterService {

	ITheaterDAO TheaterDAOobject = new TheaterDAO();

	public Theater addTheater(Theater theaterObject) {

		return TheaterDAOobject.addTheater(theaterObject);
	}

	public boolean deleteTheater(int theaterId) {

		return TheaterDAOobject.deleteTheater(theaterId);
	}

public Map<Integer,Theater> viewTheaters() {
		return TheaterDAOobject.viewTheaters();
	}
	/*
	 * validation rules 1.Theater Id will be min 4 digit starting with 2 
	 * Name field in any class should not be null.
	 */

	public static boolean isValidTheaterId(int theaterId) {
		boolean flag = false;
		String id = theaterId + "";
		flag = id.matches("[2][0-9]+");
		if (flag == false) {
			try {
				throw new InValidIdException("Invalid TheaterId");
			} catch (InValidIdException ex) {

			}
		}

		return flag;
	}

	public static boolean isValidTheaterName(String theaterName) {
		boolean flag = false;
		/*
		 * if(theaterName.matches("[A-Z][a-z]+")); { flag=true; }
		 */

		flag = theaterName.matches("[a-z][a-z]+");

		if (flag == false) {
			try {
				throw new InValidNameException("Invalid TheaterName");
			} catch (InValidNameException ex) {

			}
		}
		return flag;
	}

	public static boolean isValidmanagerName(String managerName) {
		boolean flag = false;
		flag = managerName.matches("[a-z][a-z]+");
		if (flag == false) {
			try {
				throw new InValidNameException("Invalid managerName");
			} catch (InValidNameException ex) {

			}
		}
		return flag;
	}

	public static boolean isValidmanagerContact(String managerContact) {
		boolean flag = false;

		flag = managerContact.matches("(0|91)?[1-9][0-9]{9}");
		if (flag == false) {
			try {
				throw new InValidNameException("Invalid managerContact");
			} catch (InValidNameException ex) {

			}
		}

		return flag;
	}

	public static boolean existIdCheck(Theater theaterobject)
	{
		boolean flag = false;
		
		flag=theaterobject.listOfTheaters.containsKey(theaterobject.getTheaterId());
		
		
		return flag;

		
	}
	public static boolean userValidation(Theater object) {
		boolean flag = false;
		if (isValidTheaterId(object.getTheaterId()) && isValidTheaterName(object.getTheaterName())
				&& isValidmanagerName(object.getManagerName()) && isValidmanagerContact(object.getManagerContact())) {
			flag = true;
		}
		return flag;

	}

	

}
