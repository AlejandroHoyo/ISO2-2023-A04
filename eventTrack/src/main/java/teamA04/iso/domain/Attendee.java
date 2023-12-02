package teamA04.iso.domain;
import teamA04.iso.domain.Event;

public class Attendee {
	
	private String userID;
	
	private String userName;
	
	private String password;
	
	private String type;

	public Attendee(String userID, String userName, String password, String type) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.type = type;
	}

	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Attendee [userID=" + userID + ", userName=" + userName + ", password=" + password + ", type=" + type
				+ "]";
	}

	
	public boolean login(Attendee a) {
		if(userID==a.userID) {
			return true;
		}else {
			return false;
		}
	
	}
	
	public boolean logout(){
		boolean exit = true;
		
		return exit;
	}
	
	public void attendEvent(Event e) {
		
	}
	
	public void evaluateEvent(Event e) {
		
	}
}