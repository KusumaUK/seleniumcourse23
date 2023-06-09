package week1.day2;

public class LearnInputAndOutput {
	public double sum(int num1,int num2,double num3)
	{
		double result=num1+num2+num3;
		return result;
		//int num1=10;
		//int num2=20;
		//System.out.println(num1+num2+num3);
		//System.out.println("last line");
	}
	public void getEmployee(String firstName)
	{
		System.out.println(firstName);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LearnInputAndOutput ln=new LearnInputAndOutput();
   double re= ln.sum(20,40,98);
   System.out.println(ln);
    System.out.println("last code in main");
    ln.getEmployee("hello");
	}

}
