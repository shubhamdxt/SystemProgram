package programs;

public class SecondLargestInArrayExample {

	
	public static void main(String [] args) 
	{
		int a[]={1,2,5,6,3,2,8,4,9,2};
		int size=a.length-1;
		int temp;
     	for (int i = 0; i < size; i++) 
		        {
		            for (int j = i + 1; j < size; j++) 
		            {
		                if (a[i] > a[j]) 
		                {
		                    temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		                }
		            }
		        }
	
	int b=a[size-2];
	System.out.println("second largest element in array:"+b);
	System.out.println("hhhhhhhhhhhh");
		
	}	
	}
 