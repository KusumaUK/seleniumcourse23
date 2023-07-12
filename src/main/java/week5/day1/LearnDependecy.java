package week5.day1;

import org.testng.annotations.Test;

public class LearnDependecy {
	
	
	@Test
	public void createLead()
	{
		System.out.println("createlead testcase");
		throw new RuntimeException("check the locator");
	}

	@Test(priority=-1,dependsOnMethods="createLead")
	public void EditLead()
	{
		System.out.println("editlead testcase");
	}
  
	@Test(dependsOnMethods="editLead")
	public void deleteLead()
	{
		System.out.println("deletelead testcase");
	}

}
