import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number:");
		try
		{
		
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Invalid Input");
		}
		

	}

}
