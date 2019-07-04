import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input :");
		try
		{
		 year = sc.nextInt();
		 if(year%4==0)
		 {
			 System.out.println("Output : Yes");
		 }
		 else
		 {
			 System.out.println("Output : No");
		 }
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid Input");
		}

	}

}
