package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//to create list
		List<String> mentors=new ArrayList<String>();
		
		System.out.println(mentors);
		mentors.add("aravind");
		mentors.add("princila");
		mentors.add("subraja");
		mentors.add("raghu");
		System.out.println(mentors);
		
//		List<String> newmentors=new ArrayList<String>();
//
//		newmentors.addAll(mentors);
//		System.out.println(newmentors);
		
//  add values of one list to another
		List<String> newmentors=new ArrayList<String>(mentors);
		System.out.println(newmentors);
		
		// to retrieve the specific value from the list---->using index
		String name=newmentors.get(2);
		System.out.println(name);
		
//to return count of elements in the list
//command+2+l--->to get retrn type 
		int size=newmentors.size();
		System.out.println(size);
		
//add third position one more name--->insert any value inside list
		newmentors.set(3, "lakshmi");
		System.out.println(newmentors);
		newmentors.add("raghu");
		System.out.println(newmentors);
		
		System.out.println(newmentors.size());
//to retrieve all the values as string
		for(int i=0;i<newmentors.size();i++)
			System.out.println(newmentors.get(i));
//to remove the data from particular index
		String remove=newmentors.remove(4);
		System.out.println(remove);
		System.out.println(newmentors);
//to remove all the data in compared with other list
		newmentors.removeAll(mentors);
		System.out.println(newmentors);
//to empty/delete all the datas in the list
		newmentors.clear();
		System.out.println(newmentors);
//to check any value values present inside a list
		boolean contains=mentors.contains("lakshmi");
		System.out.println(contains);
		
		mentors.add(3, "aarya");
		System.out.println(mentors);
		
 //       Object[] array = mentors.toArray();
		Collections.sort(mentors);
		System.out.println(mentors);
		
		Collections.reverse(mentors);
		System.out.println(mentors);

//to get the max or min 
		   String max = Collections.max(mentors);
		   System.out.println(max);
		
	}

}
