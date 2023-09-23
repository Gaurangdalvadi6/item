package gaurang_test;

import java.util.Scanner;

public class UserRecordList {
public static void main(String[] args) {
	UserRecordManagement ur = new UserRecordManagement();
	
	User user = new User();
	
	user.setId(1);
	user.setName("gaurang");
	user.setCategory("itmaterial");
	user.setItem("keyboard");
	user.setPoints(5);
	
	ur.add(user);
	
	Scanner sc = new Scanner(System.in);
	
	int option = 0;
	
	do {
		menu();
		
		option = sc.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("what is id?");
			int id = sc.nextInt();
			
			System.out.println("what is name");
			String name = sc.next();
			
			System.out.println("what is category");
			String category = sc.next();
			
			System.out.println("what is item");
			String item = sc.next();
			
			System.out.println("points enter");
			int points = sc.nextInt();
			
			user = new User(id,name,category,item,points);
			break;
			
		case 2:
			System.out.println("what is user id");
			int userId = sc.nextInt();
			
			if (!ur.find(userId)) {
				System.out.println("user id is does not exits\n");
			}
			break;
		case 3: 
			ur.display();
			break;
		case 4:
			System.out.println("\n Goodbye!\n");
			System.exit(0);
			break;
		default:
			break;
		}
	} while (option != 5);
}
public static void menu() {
	System.out.println("menu");
	System.out.println("1 : add user");
	System.out.println("2 : find user");
	System.out.println("3 : display user");
	System.out.println("4 : exit program");
	System.out.println("enter your selection : ");
	
	
}
}
