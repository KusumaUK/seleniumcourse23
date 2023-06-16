package week3.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string will acceptbsequence of characters
		//declaring string in literal way
		String str="Testleaf";//string pool-->special memory
		String s1="Testleaf";
		String s=new String("Testleaf");//heap memory
		//==will always compare the string memory location
		if(s1==s) {
			System.out.println("same location");
		}else {
			System.out.println("different location");
		}
		if(s1.equals(s)) {
			System.out.println("values are same");
		}else {
			System.out.println("values are differ");
		
		}
		if(s.equalsIgnoreCase(s)) {
			System.out.println("same values");
		}else {
			System.out.println("diif values");
		}
       
	}

}
