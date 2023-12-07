package teamA04.iso.domain;

import java.util.Date;
import java.util.LinkedList;

import teamA04.iso.presentation.AttendanceWindow;

public class Event {
	private String name;
	private String type;
	private Date date;
	private String description;
	private LinkedList<Attendee> attendee;
	private String eventID;
	private LinkedList<Attendee> registeredList;
	private int capacity;
	
	public Event(String name, String type, Date date, String description,LinkedList<Attendee> attendee, 
			String eventID, LinkedList <Attendee> registeredList,int capacity) {
		setName(name);
		setType(type);
		setDate(date);
		setDescription(description);
		setAttendee(attendee);
		setEventID(eventID);
		setList(registeredList);
		setCapacity(capacity);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setAttendee(LinkedList<Attendee> attendee) {
		this.attendee=attendee;
	}
	public void setEventID(String eventID) {
		this.eventID = eventID;
	}
	public void setList(LinkedList<Attendee> registeredList) {
		this.registeredList=registeredList;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String getInformation() {
		String info="name:"+name+", type"+type+", date:"+date.toString() +
				", description"+description+", attendees:"+attendee+
				", eventId:"+eventID +", registeredList:"+registeredList + ", capacity:" + capacity;
		return info;
	}
	
	public void updateEvent(String name, String type, Date date, 
			String description,LinkedList<Attendee> attendee, String eventID, 
			LinkedList<Attendee> registeredList, int capacity) {
		
		setName(name);
		setType(type);
		setDate(date);
		setDescription(description);
		setAttendee(attendee);
		setEventID(eventID);
		setList(registeredList);
		setCapacity(capacity);
	}
	
	public void editInformation(Event e) {
		
	}
	public String displayInformation(Event e) {
		
		return e.getInformation();
	}
	
	
}