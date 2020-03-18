package pl.restful;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	
	public static List<User> getUsers() {
		List<User> users = new ArrayList<>();
		
		users.add(new User(1, "John", "Kovalsky", "john.koval@gmail.com"));
			
		return users;
	}

}
