package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allannotations {

@BeforeSuite
void bs() {
	System.out.println("Before Siute");
}
@AfterSuite
void as() {
	System.out.println("After suite");
}
@BeforeTest
void B()
{
	System.out.println("b from before tst method");
}
@AfterTest
void Y() {
	System.out.println("y from After text methgod");
	
}
@BeforeClass
void C1() {
	System.out.println("Before class");
	
}
@AfterClass
void c2() {
	System.out.println("Afterclass");
}
@BeforeMethod
void bm()
{
	System.out.println("Before Method");
}
@AfterMethod
void Am()
{
	System.out.println("Aftermethod");
	
}
@Test(priority=1)
void TM1()
{
	System.out.println("Testmethod");
	
}
@Test(priority=2)
void TM2()
{
	System.out.println("testmethod2");
	
}
}
	
