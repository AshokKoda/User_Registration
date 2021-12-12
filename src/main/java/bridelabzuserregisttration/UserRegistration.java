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

	public static void main(String[] args) {
		
		System.out.println("-----------Welcome to User Registration------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String fname = sc.next();
		System.out.println("First Name = " + fname);
		firstName(fname);
	}

}
