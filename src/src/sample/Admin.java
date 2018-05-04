package sample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Admin {
	static File adminIDFile;	// Administrator(admin) Identification File
	static File adminPWFile;	// Administrator(admin) Password File
	public static String adminID; // Administrator(admin) Identification Number
	public static String adminPW; // Administrator(admin) Password

	// Constructor for the Admin
	public Admin(String adminID, String adminPW) throws IOException {
		Admin.setAdminID(adminID);
		Admin.setAdminPW(adminPW);;
	}

	// returns admin's ID
	public String getAdminID() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(adminIDFile));
		String AdminID = reader.readLine();
		reader.close();
		return AdminID;

	}

	// sets Admin's PW
	public static void setAdminPW(String userPW) throws IOException {
		File adminPWFile = new File(
				"C:\\Users\\ramon\\Documents\\Softwaretechnik\\02 Semester 2\\04 Einführung in die Softwaretechnik\\00 OnTime - Master\\OnTime-master\\admin_txt\\adminPW.txt");
		Admin.adminPWFile=adminPWFile;
		FileWriter fileWriter = new FileWriter(adminPWFile);
		Admin.adminID = User.getUserPW();
		fileWriter.write(userPW);
		fileWriter.flush();
		fileWriter.close();
	}

	// sets Admin's ID
	public static void setAdminID(String userID) throws IOException {
		File adminIDFile = new File(
				"C:\\Users\\ramon\\Documents\\Softwaretechnik\\02 Semester 2\\04 Einführung in die Softwaretechnik\\00 OnTime - Master\\OnTime-master\\admin_txt\\adminID.txt");
		Admin.adminIDFile=adminIDFile;
		FileWriter fileWriter = new FileWriter(adminIDFile);
		Admin.adminID = User.getUserID();
		fileWriter.write(userID);
		fileWriter.flush();
		fileWriter.close();
	}

	// returns admin's Password
	public String getAdminPW() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(adminPWFile));
		String AdminPW = reader.readLine();
		reader.close();
		return AdminPW;
	}

	// creates a new user
	public void creatUser(String newID, String newPW) {
	}

	// changes user's PW
	public static void changeUserPW(String newPW) {
		//todo passwort aendern
	}

	public static void main(String[] args) throws IOException {
        Admin newAdmin = new Admin("admin", "123");
        System.out.println(newAdmin.getAdminID());
        System.out.println(newAdmin.getAdminPW());
    }
	
}
