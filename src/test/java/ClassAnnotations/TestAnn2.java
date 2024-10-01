package ClassAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestAnn2 {
	@Test
void X(){
	System.out.println("Xfrom testann2");
}
@AfterTest
void Y() {
	System.out.println("y from After text methgod");
	
}
}
