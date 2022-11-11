package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2,3,6,7,9,11};
		int arr2[]= {4,6,8,9,12,2};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}

	}

}
}
