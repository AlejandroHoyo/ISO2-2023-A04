package domain;

public class Certificate {
	
	private String cetificateID;
	
	private boolean status_sent;

	private Attendee student;
	
	private Event_Organizer teacher;
	
	private Event event;
	

	public Certificate(String cetificateID, boolean status_sent, Attendee student, Event_Organizer teacher, Event event) {
		this.cetificateID = cetificateID;
		this.status_sent = status_sent;
		this.student = student;
		this.teacher = teacher;
		this.event = event;
	}

	public String getCetificateID() {
		return cetificateID;
	}


	public void setCetificateID(String cetificateID) {
		this.cetificateID = cetificateID;
	}


	public boolean isStatus_sent() {
		return status_sent;
	}


	public void setStatus_sent(boolean status_sent) {
		this.status_sent = status_sent;
	}


	public Attendee getStudent() {
		return student;
	}


	public void setStudent(Attendee student) {
		this.student = student;
	}


	public Event_Organizer getTeacher() {
		return teacher;
	}


	public void setTeacher(Event_Organizer teacher) {
		this.teacher = teacher;
	}


	public Event getEvent() {
		return event;
	}


	public void setEvent(Event event) {
		this.event = event;
	}
	
	public void addSignature() {
		
	}
	
	public void emailStudent() {
		
	}

	
}