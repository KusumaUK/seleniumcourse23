package week3.day2;

public class StringConversion {

	public static void main(String[] args) {
		String price="product price 1234";
		String replaceAll = price.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		String replaceAll2 = price.replaceAll("[^a-zA-Z]", "");
		System.out.println(replaceAll2);
		
		String concat=replaceAll.concat("5");
		
		System.out.println(concat+5);
		
		
		//convert the string into integer
		int parseInt = Integer.parseInt(concat);
		System.out.println(parseInt+5);
		
	}

}
