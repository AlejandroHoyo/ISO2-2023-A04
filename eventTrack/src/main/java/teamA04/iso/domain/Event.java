package teamA04.iso.domain;

import java.util.Date;
import java.util.LinkedList;

public class Event {
	private String name;
	private String type;
	private Date date;
	private String description;
	private LinkedList<Attendee> attendee;
	private String eventID;
	private LinkedList<Attendee> registeredList;
	
	public Event(String name, String type, Date date, String description,LinkedList<Attendee> attendee, String eventID, LinkedList <Attendee> registeredList) {
		setName(name);
		setType(type);
		setDate(date);
		setDescription(description);
		setAttendee(attendee);
		setEventID(eventID);
		setList(registeredList);
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
	public String getInformation() {
		String info="name:"+name+", type"+type+", date:"+date.toString()+", description"+description+", attendees:"+attendee+", eventId:"+eventID;
		return info;
	}
	
	public void updateEvent(String name, String type, Date date, String description,LinkedList<Attendee> attendee, String eventID) {
		setName(name);
		setType(type);
		setDate(date);
		setDescription(description);
		setAttendee(attendee);
		setEventID(eventID);
	}
	
	public void editInformation(Event e) {
		
	}
	public String displayInformation(Event e) {
		
		return e.getInformation();
	}
	
	
}