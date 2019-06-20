package programs;

public class TwoConsecutiveNSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {3,1,5,7,9,4};
		int sum=0;
		for(int i=0;i+1<a.length;i++)
		{
			
			sum=a[i]+a[i+1];
			
			
		}
	System.out.println("the sum of consequtive :"+sum);

	}

}
