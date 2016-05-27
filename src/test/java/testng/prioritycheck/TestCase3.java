package testng.prioritycheck;

import org.testng.annotations.Test;

public class TestCase3 {
	@Test(priority=2,description="This is test case 3 executing @ 3rd position")
	public void testCase1() {
		System.out.println("This is test case 3 executing @ 3rd position");
	}
}
