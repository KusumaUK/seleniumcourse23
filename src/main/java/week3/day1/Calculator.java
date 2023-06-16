package week3.day1;

public class Calculator {
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(int x,int y,int z )
	{
		System.out.println(x+y+x);
	}
	public void mul(float a,float b)
	{
		System.out.println(a*b);
	}
	public void mul(double a,double b)
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(10,20);
		c.add(10,20,30);
		c.mul(2, 2);
		c.mul(4,4);
		

	}

}
