package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;*/

public class Annotations {
/*	@BeforeMethod
	void login()
	{
		System.out.println("Login page");
		
	}
	@Test(priority=1)
	void Search()
	{
		System.out.println("Search page");
		
	}
	@Test
	void Advsearch()
	{
		System.out.println("Advsearch");
		
	}
	@AfterMethod
	void logout()
	{
		System.out.println("Logout page");
		
	}*/
	
	// USing@before and after class
	@BeforeClass
	void login()
	{
		System.out.println("Login page");
		
	}
	@Test(priority=1)
	void Search()
	{
		System.out.println("Search page");
		
	}
	@Test(priority=2)
	void Advsearch()
	{
		System.out.println("Advsearch");
		
	}
	@AfterClass
	void logout()
	{
		System.out.println("Logout page");
		
	}
	

}
