
package teamA02.iso.domain;

public class User {
	private String userName;
	private String password;
	private String userType;
	private int userID;
	
	public User(String userName, String password, String userType, int userID) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.userID = userID;
	}

	public void login() {

	}

	public void logout() {

	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", userType=" + userType + ", userID=" + userID
				+ "]";
	}
	

}
