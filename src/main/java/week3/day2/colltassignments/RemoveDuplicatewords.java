package week3.day2.colltassignments;

public class RemoveDuplicatewords {

	public static void main(String[] args) {
		/*
		 * Pseudo code 

		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";
		 *
		 *Output= We learn java basics as part of sessions in week1
		 *
		 * Psuedocode
		 *
		 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
		 * c) Create a empty Set 
		 * d) Iterate the String array
	                 d.1) add each word into Set
		 * e) Print the Set values which is having unique words
		 */
		
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;

		String[] split = text.split(" ");

		for (int i = 0; i < split.length; i++) {

		for (int j = i+1; j < split.length; j++) {
		    //split[0] split[1]
		    //split[0] split[2]
		if(split[i].equalsIgnoreCase(split[j])) {
		    //java java
		    split[j] = "";
		    
		    count++;
		}
		}
		}

		if(count>0) {

		for (int k = 0; k < split.length; k++) {

		System.out.print(split[k]+" ");

		}
		}

			}

		
	}


