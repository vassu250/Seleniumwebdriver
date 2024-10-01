package Testng;

import org.testng.annotations.Test;

public class Signuptests {
	@Test(priority=1,groups={"abc"})
	void signupbyemail() {
		System.out.println("signup by email");
	}
	@Test(priority=2,groups={"abc"})
	void signupbyfacebook() {
		System.out.println("signup by facebook");
	}
	@Test(priority=3,groups={"abc"})
	void signupbytwitter() {
		System.out.println("signup by twitter");
	}
	
}
