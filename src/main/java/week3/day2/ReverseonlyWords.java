package week3.day2;

public class ReverseonlyWords {

	public static void main(String[] args) {
		String s="Testleaf Learning";
		//reverse string like this   faeltseT gninraeL
		//split()method to seperate words
		String[] split = s.split("e");
		System.out.println(split[0]);
		System.out.println(split.length);
		//iterate and print it
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}

	}

}
