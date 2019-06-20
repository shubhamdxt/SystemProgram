package programs;

public class Payramid3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  for (int i = 1; i <= 5; i++) {
              int k=i;
              for (int j = 1; j <= 5; j++) {
                    System.out.print((j<= 5-i  ? " " : k--));                                                 
              }
              System.out.println();
       }

	}

}
