package programs;

public class SwapFrstLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeks for geeks";
		
		 char[] ch = str.toCharArray(); 
		 for (int i = 0; i < ch.length; i++) { 
			  
	            // k stores index of first character 
	            // and i is going to store index of last  
	            // character.  
	            int k = i; 
	            while (i < ch.length && ch[i] != ' ')  
	                i++; 
	              
	            // Swapping 
	            char temp = ch[k]; 
	            ch[k] = ch[i - 1]; 
	            ch[i - 1] = temp; 
	  
	            // We assume that there is only one space 
	            // between two words. 
	        }
		 System.out.println(ch); 
	}

}
