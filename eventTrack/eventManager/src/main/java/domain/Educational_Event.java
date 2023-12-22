package domain;

import java.util.LinkedList;
import teamA04.iso.domain.Event_Manager;

public class Educational_Event extends Event{

	private String subjectName;
	
	private LinkedList<Attendee> studentList;
	
	public Event_Manager Teacher = new Event_Manager(organizerID,name,subjects);

	public Educational_Event(String subjectName, LinkedList<Attendee> studentList, teamA04.iso.Event_Manager teacher) { 
		
		super(name, type, date, description, attendee, eventID, registeredList);
		
		this.subjectName = subjectName;
		
		this.studentList = studentList;
		
		Teacher = teacher;
	}
	
	

}
