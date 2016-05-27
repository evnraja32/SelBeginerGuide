package testng.prioritycheck;

import org.testng.annotations.Test;

public class TestCase2 {
	@Test(priority=1,description="This is test case 2 executing @ 1st position")
	public void testCase1() {
		System.out.println("This is test case 2 executing @ 1st position");
	}
}
