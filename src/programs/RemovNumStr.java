package programs;

public class RemovNumStr {

	public static void main(String[] args) {
		String s= "hello647hi74joke";
	    char[] ch=s.toCharArray();
	    System.out.println("Result = "+getString(ch));
	 }
	 static String getString(char[] ch){
	   int m = 0;
	   char[] chr=new char[11];
	   char[] chn = {'0','1','2','3','4','5','6','7','8','9'};
	   for(int i = 0 ; i < ch.length ; i++){
	       for(int j = 0 ; j < chn.length ; j++){  
	           if(ch[i]==chn[j])
	           {
	               m--;
	               break;
	           }else{
	               chr[m]=ch[i];
	           }
	       }
	       m++;
	     }
	     String st = String.valueOf(chr);
	     return st;
	     }

}
