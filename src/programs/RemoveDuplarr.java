package programs;

public class RemoveDuplarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,2,4,3,3,5};
		int j=0;

		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				
			//	temp[j]=arr[i];
				j++;
			}
		}
		for(int k=0;k<arr.length-1;k++) {
		System.out.println(arr[j]);
		}
	}

}
