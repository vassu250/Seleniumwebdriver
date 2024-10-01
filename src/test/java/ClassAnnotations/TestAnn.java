package ClassAnnotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnn {
@Test
void A()
{
	System.out.println("a ffrom testann1");
}
@BeforeTest
void B()
{
	System.out.println("b from before tst method");
}


}

