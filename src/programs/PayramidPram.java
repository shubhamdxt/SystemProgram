package programs;

public class PayramidPram {

	public static void main(String[] args) {
		int p=1;
		for(int i=1;i<8;i++) {
			
			for(int j=1;j<=(8-i);j++) 
			{
				System.out.print(" "); 
			}
			
			for(int k=1;k<=(8-i);k++) 
			{
				System.out.print(" "); 
			}

			for(int j=1;j<=2*i-1;j++)
			{	
			System.out.print(p++);
			}
			System.out.println();
		}

	}

}
