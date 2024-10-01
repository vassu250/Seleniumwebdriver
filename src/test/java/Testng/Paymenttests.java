package Testng;

import org.testng.annotations.Test;

public class Paymenttests {
	@Test(priority=1,groups={"sanity","abc"})
void paymentinrs()
{
	System.out.println("payment in rs");
}
	@Test(priority=2,groups={"sanity","abc"})
	void paymentindollar()
	{
		System.out.println("payment in dollar");
	}

}
