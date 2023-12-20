package teamA04.iso.domain;

import java.util.LinkedList;

public class Event_Organizer {

	private String signature;
	
	private LinkedList<Event> organizedEvents = new LinkedList <Event>;
	
	
	public Event_Organizer(String signature) {
		this.signature = signature;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Event organizeEvent() {
		return Event e;
	}
	
}
