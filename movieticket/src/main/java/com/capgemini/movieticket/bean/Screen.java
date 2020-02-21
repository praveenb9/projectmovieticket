package com.capgemini.movieticket.bean;

import java.util.ArrayList;
import java.util.List;

public class Screen {
 int numberOfScreens;
public List<Show> showList=new ArrayList<Show>();

	public Screen(int numberOfScreens, List<Show> showList) {
	super();
	this.numberOfScreens = numberOfScreens;
	this.showList = showList;
}

	public Screen() {}

/*public Screen(int numberOfScreens) {
	super();
	this.numberOfScreens = numberOfScreens;
}*/

public int getNumberOfScreens() {
	return numberOfScreens;
	
}

public void setNumberOfScreens(int numberOfScreens) {
	this.numberOfScreens = numberOfScreens;
}

public List<Show> getShowList() {
	return showList;
}

public void setShowList(Show showObject) {
	this.showList = (List<Show>) showObject;
}

@Override
public String toString() {
	return "numberOfScreens=" + numberOfScreens + ", showList=" + showList;
}




}
