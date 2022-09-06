package controller;

import java.util.HashMap;
import java.util.Map;

import model.User;

public class DB {
	
	Map<String,User>Users = new HashMap<>();
	public String add(User user) {
		try {
		
			Users.put(user.getEmail(),user);
		    return "User Saved!";
		} catch (Exception e) {
			
		    return "Exeption";
		}
		
	}
	
	
	//to check if the user already exists
	
	public boolean exist(String email) {
		
		if (Users.containsKey(email)) {
			return true;
			
		}else {
			return false;
		}
		
	}
	
	//get the user
	
	public User getuser(String email) {
		
		return Users.get("email");
		
	}

}

