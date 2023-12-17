package domain;

import java.util.LinkedList;

public class Event_Manager {
	
	private String organizerID;
	
	private String name;
	
	public LinkedList <Educational_Event> subjects;

	public String getOrganizerID() {
		return organizerID;
	}

	public void setOrganizerID(String organizerID) {
		this.organizerID = organizerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedList<Educational_Event> getSubjects() {
		return subjects;
	}

	public void setSubjects(LinkedList<Educational_Event> subjects) {
		this.subjects = subjects;
	}

	
	public void assignToSubject() {
		
	}
}
