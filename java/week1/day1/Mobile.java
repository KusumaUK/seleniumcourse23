package week1.day1;

public class Mobile {
	public void makeCall()
	{
		System.out.println("made a call");
	}
	public void sendMsg()
	{
		System.out.println("say hello");
		
	}

	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.makeCall();
		m1.sendMsg();
		
	}

}
