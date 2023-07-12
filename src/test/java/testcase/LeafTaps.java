package testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeafTaps {
	
	@Test
	public void testcase()
	{
		System.out.println("testcase");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Leaftaps:beforeMethod");
	}
	

}
