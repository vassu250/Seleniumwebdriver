package Testng;

import org.testng.annotations.Test;

public class Logintests {
	@Test(priority=1,groups={"sanity"})
	void loginByEmail()
	{
		System.out.println("login email");
	}
	@Test(priority=2,groups={"sanity"})
	void loginByFacebook()
	{
		System.out.println("login face");
	}
	@Test(priority=3,groups={"sanity"})
	void loginByTwitter()
	{
		System.out.println("login twi");
	}
	@Test(priority=4,groups={"sanity"})
	void loginByGmail()
	{
		System.out.println("login gmail");
	}
}
