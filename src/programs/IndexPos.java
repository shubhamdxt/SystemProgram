package programs;

public class IndexPos {

	public static void main(String[] args) {
		
		int [] a= {10,20,15,4,15,1};
		int temp=0;
   for(int i=0;i<a.length;i++) {
	 for(int j=1;j<a.length;j++) {
		 if(a[i]<a[j])
			 i++;
	 } 
 }
	}

}
