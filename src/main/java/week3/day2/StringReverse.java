package week3.day2;

public class StringReverse {

	public static void main(String[] args) {
		String s="Testleaf";
		
		//faeltseT
		char[] charArray=s.toCharArray();
	//	System.out.println("  string "+s);
	//	System.out.println("reverse string");
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.println(charArray[i]);
		}
		

	}

}
