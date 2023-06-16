package week3.day2.colltassignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
//		Declare a String as "PayPal India"

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it
		String input = "PayPal India";
		char[] Array = input.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for(int i = 0; i<Array.length;i++)
		{	
			boolean addval = charSet.add(Array[i]);
			
			if(!addval)
				dupCharSet.add(Array[i]);	
		}
		
		if(dupCharSet.size()!= 0) {
			System.out.println("Unique characters:");
		for(Character s : charSet)
			System.out.print(s);
		System.out.println("\nDuplicate character :");
		for(Character s : dupCharSet)
							System.out.print(s);
	}

		
	}

}
