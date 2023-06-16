package week3.day2.colltassignments;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;

				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */
				
				
				int a[]= {3,2,11,4,6,7,2,3,3,6,7};
				int largest=a[0];
				int sec_largest=a[1];
				for(int i=0;i<a.length;i++)
				{
					if(a[i]>largest)
					{
						sec_largest=largest;
						largest=a[i];
					}
					else if(a[i]>sec_largest&&a[i]!=largest)
					{
						sec_largest=a[i];
					}
				}
				System.out.println("second largest is:"+sec_largest);

			}
				
			}

			
		
	
