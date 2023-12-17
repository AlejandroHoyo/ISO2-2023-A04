package domain;
import java.util.LinkedList; 

public class UserCalendar {
	
	private LinkedList<Event> events;
	
	private String userId;

	public UserCalendar(String userId, LinkedList<Event> events) {
		super();
		this.userId = userId;
	}
	
	public void addEvent(Event e){
		events.add(e);
	}
	
	public void removeEvent(Event e){
		events.remove(e);
	}

	public LinkedList<Event> getEvents() {
		return events;
	}

	public void setEvents(LinkedList<Event> events) {
		this.events = events;
	}
	
}
