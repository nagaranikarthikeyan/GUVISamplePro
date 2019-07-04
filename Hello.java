import java.util.InputMismatchException;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n;
       Scanner sc=new Scanner(System.in);
		System.out.print("Input :");
		try
		{
		 n = sc.nextInt();
		 System.out.println("Output : ");
		 for(int i=1;i<=n;i++)
		 {
			 System.out.println("Hello");
		 }
		}
		catch (InputMismatchException e) {
			System.out.println("Output : Invalid Input");
		}
	}

}
