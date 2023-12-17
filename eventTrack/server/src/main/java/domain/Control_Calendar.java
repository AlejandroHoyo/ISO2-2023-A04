package domain;

import java.util.LinkedList;

public class Control_Calendar {

	public LinkedList<Event> getAvailableEvents(UserCalendar a){
		//Check availability
		LinkedList<Event> list = new LinkedList<Event>();//LinkedList
		return list;
	}
	
	public void addEventToUserCalendar(Event e, UserCalendar a) {
		a.events.add(e); 
	}
}
