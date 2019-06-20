package programs;

public class RevVow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="shubham";
		String s = "";
	    int f = 0;
        char c = 0;

	    for(int i = 0; i < input.length(); i++){

	        if(c == 'a'|c == 'e'|c == 'i'|c == 'o'|c =='u' | c == 'A' | c == 'E' | c == 'I' | c == 'O' | c == 'U')
	            f = 1;
	        else{
	            s = s + i;
	            f = 0;
	        }
	        System.out.println(s);
	    }

	}

}
