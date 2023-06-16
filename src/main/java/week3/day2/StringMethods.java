package week3.day2;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cName="Testleaf";
       //to get the count of characters in the string
		int length = cName.length();
		System.out.println(length);
		//index starts with zero
		char charAt = cName.charAt(3);
		System.out.println(charAt);
		//to convert string into character
		char[] charArray = cName.toCharArray();
		//to print the array directly
		//System.out.println(Arrays.toString(charArray));
		
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]);
		}
		for(Character c:charArray)//here c is object reference for the Character class
		{
			System.out.println(c);
		}
		
		}
		
	}


