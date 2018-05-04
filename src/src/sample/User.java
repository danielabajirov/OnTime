package sample;

public class User {

	public static String userID; // user Identification Number
	public static String userPW; // user Password
	
	
	public User(String userID, String userPW) {
		User.userID = userID;
		User.userPW = userPW;
	}

	public static String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		User.userID = userID;
	}
	public static String getUserPW() {
		return userPW;
	}
	public static void setUserPW(String userPW) {
		User.userPW = userPW;
	}

	
	

}