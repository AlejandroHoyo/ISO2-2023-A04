package domain;

import java.util.LinkedList; 

public class Educational_Event extends Event{

	private String subjectName;
	
	private LinkedList<Attendee> studentList;
	
	public Event_Manager Teacher = new Event_Manager();

	public Educational_Event(String subjectName, LinkedList<Attendee> studentList, Event_Manager teacher) { 
		
		super(name, type, date, description, attendee, eventID, registeredList);
		
		this.subjectName = subjectName;
		
		this.studentList = studentList;
		
		Teacher = teacher;
	}
	
	

}
