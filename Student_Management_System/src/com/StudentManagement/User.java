package com.StudentManagement;

@SuppressWarnings("all")
public class User {
	
	private static String ID;
	private static int key;
	private static String user;
	
	
//	public User(String userName, String  ID, int key) {
//		this.user = userName;
//		this.ID = ID;
//		this.key = key;
//	}

	public static String getID() {
		return ID;
	}

	public static void setID(String ID) {
		User.ID = ID;
	}

	public static int getKey() {
		return key;
	}

	public static void setKey(int key) {
		User.key = key;
	}

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		User.user =	 user;
	}
}
