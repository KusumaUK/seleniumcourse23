package week3.day2.colltassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.graphbuilder.struc.LinkedList;

public class MissingNumber {

	public static void main(String[] args) {
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		
		int[] number = {1,1,2,3,4,6,7,8,10};
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0; i <number.length; i++)
		{
			set.add(number[i]);
		}
		List<Integer> intl = new ArrayList<Integer>();
		intl.addAll(set);
		//System.out.println(intList);
		for(int i=0; i <set.size(); i++)
		{
			if(i!= (intl.size()-1))
		   if(Math.abs(intl.get(i) - intl.get(i+1))!=1)
			   {
			   System.out.println(intl.get(i)+1);
			   }
		}
	}
}
			  
	
