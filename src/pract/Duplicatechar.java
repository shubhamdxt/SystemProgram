package pract;

public class Duplicatechar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="akashuktyhuats";
       
       for(int i=0;i<str.length();i++)
       {
    	   int count=0;
    	   for(int j=0;j<str.length();j++) {
    		   if(j<i && str.charAt(i)==str.charAt(j)) {
    			   count++;
    			   
    		   }
    		   
    	   }
    	   
    	   System.out.println(str.charAt(i)+" "+count);
       }
	}

}
