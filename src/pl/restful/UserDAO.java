package pl.restful;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	
	static List<User> users = new ArrayList<>();
	
	public static List<User> getUsers() {
		
		return users;
	}

	public static void addUser(User user) {
		// TODO Auto-generated method stub
		users.add(user);
		
	}

	public static void updateUserEmail(int id, String email) {
		// TODO Auto-generated method stub
		users.get(id).setEmail(email);
		
	}

}
