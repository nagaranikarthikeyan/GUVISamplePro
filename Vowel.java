
import java.util.Scanner;

public class Vowel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input : ");
		
		ch=sc.next().charAt(0);
		if((ch=='a')||(ch=='A')||(ch=='E')||(ch=='e')||(ch=='I')||(ch=='i')||(ch=='O')||(ch=='o')||(ch=='U')||(ch=='u'))
		{
			System.out.println("Output : vowel");
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("Output : Consonant");
		}
		else
		{
			System.out.println("Output : Invalid");
		}
		
	}

}
