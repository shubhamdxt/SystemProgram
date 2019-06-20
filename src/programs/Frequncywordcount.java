package programs;

public class Frequncywordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="akashuktyhuats";
       char [] ch=str.toCharArray();
       for(int i=0;i<ch.length;i++) {
    	   int count=0;
    	   for(int j=0;j<ch.length;j++) 
    	   {
    		   if(ch[j]==ch[i]) {
    			   count++;
    		   }
    		   if(j<i && ch[i]==ch[j]) {
    			   break;
    		   }
    	   }
    	   if(count>0) {
    		   System.out.println(ch[i] + " is "+count);
    	   }
       }
	}

}
