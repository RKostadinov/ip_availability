package main;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import user.User;

public class DataHolder {
	public List<String> currentlyLoggedUsers;
	public Map<String, User> usersToLoginCount;
	
	private static DataHolder instance;
	
	private DataHolder() {
		currentlyLoggedUsers = new LinkedList<String>();
		usersToLoginCount = new HashMap<String, User>();
	}

	public static synchronized DataHolder getInstance(){
		if(instance == null){
			instance = new DataHolder();
		}
		return instance;
	}

}
