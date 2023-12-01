package teamA04.iso.domain;

import teamA04.iso.domain.User_Calendar;
import java.util.LinkedList;
import teamA04.iso.domain.Event;

public class Control_Calendar {

	public LinkedList<Event> getAvailableEvents(User_Calendar a){
		//Check availability
		LinkedList<Event> list = new LinkedList<Event>  //LinkedList
		return list;
	}
	
	public void addEventToUserCalendar(Event e, User_Calendar a) {
		a.events.add(e); 
	}
}
