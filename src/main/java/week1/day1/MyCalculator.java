package week1.day1;

import week1.day2.Calculator;

public class MyCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculator m=new Calculator();
    System.out.println(m.add(10,20,30));
    System.out.println(m.sub(30,10));
    System.out.println(m.multi(10,10));
    System.out.println(m.div(100f,10f));
	}

}
