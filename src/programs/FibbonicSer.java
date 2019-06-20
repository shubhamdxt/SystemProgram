package programs;

public class FibbonicSer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x=-1,y=1;
      int z,n,i;
      i=1;
      while(i<10) {
    	  z=x+y;
    	  System.out.println(z);
      
    	  x=y;
    	  y=z;
    	  i=i+1;
      
	}
	}
}
