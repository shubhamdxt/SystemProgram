package programs;

public class CounttheSum {
	public static void main(String [] args) {
		
		int [] a= {1,2,3,4,5,6,7,8,9,10};
		int sum=0,count=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		for(int j=0;j<a.length;j++) {
			if(sum%a[j]==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
