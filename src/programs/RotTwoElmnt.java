package programs;

public class RotTwoElmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotTwoElmnt rotate = new RotTwoElmnt(); 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        rotate.leftRotate(arr, 2, 7); 
        rotate.printArray(arr, 7); 
	}

	 void printArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " ");
	}

	 void leftRotate(int[] arr, int d, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<d;i++)
			leftRotatebyOne(arr,  n);
	}

	 void leftRotatebyOne(int[] arr, int n) {
		// TODO Auto-generated method stub
	
		 int i,temp;
		 temp=arr[0];
		 for(i=0;i<n-1;i++)
			 arr[i]=arr[i+1];
		     arr[i]=temp;
	}

}
