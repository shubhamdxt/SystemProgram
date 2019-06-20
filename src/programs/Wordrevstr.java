package programs;

public class Wordrevstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is shubham";
		String revstr=" ";
		String [] word=str.split(" ");
		for(String s:word) {
			int j=s.length();
			String s1=" ";
			while(j>0) {
				char ch=s.charAt(j-1);
				s1=s1+ch;
				j--;
			}
			revstr=s1+revstr+" ";
		}
		System.out.println(revstr);

	}

}
