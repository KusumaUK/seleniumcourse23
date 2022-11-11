package week1.day2;

public class FindSecondLargestAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,33,55,42,50};
		int largest=a[0];
		int sec_largest=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				sec_largest=largest;
				largest=a[i];
			}
			else if(a[i]>sec_largest&&a[i]!=largest)
			{
				sec_largest=a[i];
			}
		}
		System.out.println("second largest is:"+sec_largest);

	}

}
