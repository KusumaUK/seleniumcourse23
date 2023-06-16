package week3.day2.colltassignments;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingcollection {

	public static void main(String[] args) {
		
			// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

			// get the length of the array		

			// sort the array			

			// Iterate it in the reverse order

			// print the array
				
			// Required Output: Wipro, HCL , CTS, Aspire Systems
     
		String[] arr= {"HCL", "Wipro", " Aspire Systems", "CTS"};
		 int length = arr.length;
		 System.out.println(length);
		 Arrays.sort(arr,Collections.reverseOrder());   
		//prints the sorted string array in descending order  
		System.out.println(Arrays.toString(arr));  
	}

}
