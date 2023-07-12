package week5.day1;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups="Smoke")
	public void createLead()
	{
		System.out.println("createlead");
	}
 @Test(groups="Sanity")
	public void EditLead()
	{
		System.out.println("editlead");
	}
 @Test(groups={"Regression","Sanity"})
	public void deleteLead()
	{
		System.out.println("deletelead");
	}
	

}
