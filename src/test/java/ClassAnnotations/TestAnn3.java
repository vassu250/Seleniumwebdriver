package ClassAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAnn3 {
	@Test
void i() {
	System.out.println("test3");
}
@BeforeSuite
void bs() {
	System.out.println("Before Siute");
}
@AfterSuite
void as() {
	System.out.println("After suite");
}
}
