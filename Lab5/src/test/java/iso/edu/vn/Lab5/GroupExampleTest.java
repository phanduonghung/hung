package iso.edu.vn.Lab5;

import org.testng.annotations.Test;

public class GroupExampleTest {
	@Test(groups = "Regression")
public void testCase1() {
	System.out.println("in test case 1 and in Regression group");
}
	@Test(groups = "Regression")
	public void testCase2() {
		System.out.println("in test case2 and in Regression group");
	}
	@Test(groups = "Regression")
	public void testCase3() {
		System.out.println("in test case 3 and in Regression group");
	}
	@Test(groups = "SmokeTest")
	public void testCase4() {
		System.out.println("in test case 4 and in SmokeTest group");
	}
}
