package user_registration;

import java.util.Scanner;

public class UserRegistration {

	public static void firstName(String fName) {
		if (fName.matches("[A-Z][a-z]{3,}")) {
			System.out.println("First name is valid.....!");
		} else {
			System.out.println("First name is not  valid.....!");
		}
	}

	public static void lastName(String lName) {
		if (lName.matches("[A-Z][a-z]{3,}")) {
			System.out.println("Last name is valid.....!");
		} else {
			System.out.println("Last name is not  valid.....!");
		}
	}

	public static void checkEmail(String email) {
		if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
			System.out.println("Email-Id is valid.....!");
		} else {
			System.out.println("Email-Id is not  valid.....!");
		}
	}

	public static void mobileFormat(String mobileNo) {
		if (mobileNo.matches("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$")) {
			System.out.println("Mobile Number is valid.....!");
		} else {
			System.out.println("Mobile Number is not  valid.....!");
		}
	}
	
	public static void passwordEightChar(String password) {
		if (password.matches("^[A-Z][0-9]{8,}")) {
			System.out.println("Password have 8 characters valid!");
		} else {
			System.out.println("Password must be have 8 characters or not valid!");
		}
	}

	public static void main(String[] args) {

		System.out.println("-----------Welcome to User Registration------------");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: "); // First name
		String fname = sc.next();
		System.out.println("Enter Last Name: "); // Last name
		String lname = sc.next();
		System.out.println("Enter Email Address: "); // Email address
		String emailId = sc.next();
		System.out.println("Enter Mobile No: "); // Mobile no
		String mobileno = sc.next();
		System.out.println("Enter Password: "); // Password must be 8 characters
		String password = sc.next();

		System.out.println();
		System.out.println("First Name = " + fname + "\n" + "Last Name = " + lname + "\n" + "Email-ID = " + emailId
				+ "\n" + "Mobile Number = " + mobileno + "\n"
				+ "Password = " + password);

		System.out.println();
		firstName(fname);
		lastName(lname);
		checkEmail(emailId);
		mobileFormat(mobileno);
		passwordEightChar(password);
	}

}
