package gaurang_test;

import java.util.LinkedList;

public class UserRecordManagement {

	LinkedList<User> list;

	public UserRecordManagement() {
		list = new LinkedList<User>();
	}
	
	
	// find the user using id
	public boolean find(int id) {
		for (User u : list) {
			
			if (u.getId() == id) {
				System.out.println(u);
				return true;
			}
		}
		return false;
	}
	
	// addind user
	public void add(User user) {
		if (!find(user.getId())) {
			list.add(user);
		} else {
			System.out.println("user is already exits");
		}
	}
	
	// find user
public User findUser(int id) {
		
		//Iterate Product list
		// using for each loop
		for (User u : list) {
			
			//checking product by id;
			if (u.getId() == id) {
				return u;
			}
		}
		return null;
	}
	
	
	public void display() {
		
		if (list.isEmpty()) {
			System.out.println("the list has no users\n");
		}
		
		for (User user : list) {
			System.out.println(user.toString());
		}
	}
	
	
}
