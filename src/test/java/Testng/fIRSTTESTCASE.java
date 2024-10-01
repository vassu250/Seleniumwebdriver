package Testng;

import org.testng.annotations.Test;

public class fIRSTTESTCASE {
	@Test(priority=1)
	void openapp()
	{
		System.out.println("opening");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("login");
	}
	@Test
	void logout()
	{
		System.out.println("logout");
	}
	
	
	
	
	
	
	

}
