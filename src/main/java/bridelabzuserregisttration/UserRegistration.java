package bridelabzuserregisttration;

import java.util.Scanner;

public class UserRegistration {
	
	public static void firstName(String fName) {
		if(fName.matches("[A-Z][a-z]{3,}")) {
			System.out.println("First name is valid.....!");
		}else {
			System.out.println("First name is not  valid.....!");
		}
	}
	
	public static void lastName(String lName) {
		if(lName.matches("[A-Z][a-z]{3,}")) {
			System.out.println("Last name is valid.....!");
		}else {
			System.out.println("Last name is not  valid.....!");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("-----------Welcome to User Registration------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: "); //First name
		String fname = sc.next();
		System.out.println("Enter Last Name: "); //Last name
		String lname = sc.next();
		
		System.out.println();
		System.out.println("First Name = " + fname + "\n"
				+ "Last Name = " + lname);
		
		System.out.println();
		firstName(fname);
		lastName(lname);
	}

}
