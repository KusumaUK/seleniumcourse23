package week5.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
  @Test(priority=4,enabled=false)
  public void test1() {
	  System.out.println("test1");
  }
  @Test(priority=2,invocationCount=3,threadPoolSize=2,invocationTimeOut=500)
  public void test2() {
	  System.out.println(Thread.currentThread().getId());
	  System.out.println("test2");
  }
  @Test(priority=0)
  public void test3() {
	  System.out.println("test3");
  }
  
}
