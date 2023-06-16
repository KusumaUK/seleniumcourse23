package org.language;

public class Automation extends MultipleLanguage implements TestTool{

	public static void main(String[] args) {
		Automation a=new Automation();
		a.ruby();
		a.python();
		a.selenium();
		a.java();
	}
	
    public void ruby() {
	System.out.println("ruby method");
	
   }

	
	public void java() {    
		
		System.out.println("java method");
	}

	
	public void selenium() {
		System.out.println("selenium method");
		
	}
	

	

}
