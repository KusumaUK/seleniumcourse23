package week1.day1;

public class LearnMethod {
	//method will give int output
	public int sum(int num1,int num2,int num3) {
		int result=num1+num2+num3;//120
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethod lm=new LearnMethod();
		int re=lm.sum(20,40,60);
		System.out.println(re * 300 /10);

	}

}
