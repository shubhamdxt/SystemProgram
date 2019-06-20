package programs;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 12321, revNumber=0, rem=0,tempNumber;
		
		tempNumber=number;
	    while(tempNumber!=0)
	    {
	        rem=tempNumber%10;
	        revNumber=revNumber*10+rem;
	        tempNumber/=10;
	    } 
if(revNumber==number) {
	
	System.out.println("number is palindrom :"+ number);
}	else
		System.out.println("number is not  palindrom :"+ number);
		
}
	}


