package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> mentors=new HashSet<String>();
		mentors.add("Aravind");
		mentors.add("Aravind");
		mentors.add("princila");
		mentors.add("Raghu");
		mentors.add("subraja");
		System.out.println(mentors);
//get() not allowed in set
		
	Set<String>	names=new TreeSet<String>();
	
	names.add("lakshmi");
//	boolean add=names.add("srinika");
//	System.out.println(add);
//	System.out.println(names);
	names.add("jyo");
//	boolean add=names.add("jyo");
//	System.out.println(add);
	names.add("charan");
	names.add("leela");
	names.add("srinika");
	names.add("jyo");
	System.out.println(names);
	
	
	
	}
}
