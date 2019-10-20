package programs;

public class DuplicateElementAraay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1, 2, 5, 5, 6, 6, 7, 2,2,2,2};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i+1;j++) {
				if((a[i]==a[j]))
				{
					System.out.println("Duplicate element are :"+a[j]);
					break;
				}
			}
		}

	}

}
