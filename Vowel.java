import java.util.Scanner;

public class Vowel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Character:");
		
		ch=sc.next().charAt(0);
		if((ch=='a')||(ch=='a')||(ch=='E')||(ch=='e')||(ch=='I')||(ch=='i')||(ch=='O')||(ch=='o')||(ch=='U')||(ch=='u'))
		{
			System.out.println("vowels");
		}
		else
		{
			System.out.println("consonants");
		}
		
	}

}
