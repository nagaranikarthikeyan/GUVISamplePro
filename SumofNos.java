import java.util.InputMismatchException;
import java.util.Scanner;

public class SumofNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,sum=0;
	       Scanner sc=new Scanner(System.in);
			System.out.print("Input :");
			try
			{
			 n = sc.nextInt();
			 for(int i=1;i<=n;i++)
			 {
				 sum=sum+i;
			 }
			 System.out.println("Output : "+sum);
			}
			catch (InputMismatchException e) {
				System.out.println("Output : Invalid Input");
			}
	}

}
