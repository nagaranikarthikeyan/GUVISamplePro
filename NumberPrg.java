import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number:");
		try
		{
		
		n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Negative");
		}
		else if(n>0)
		{
			System.out.println("Positive");
		}
		else if(n==0)
		{
			System.out.println("Zero");
		}
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Invalid Input");
		}
		
		
	}

}
