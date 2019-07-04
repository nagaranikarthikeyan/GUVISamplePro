import java.util.InputMismatchException;
import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a,b,c;
				Scanner sc=new Scanner(System.in);
				System.out.println("Input :");
				try
				{
				
				a=sc.nextInt();
				b=sc.nextInt();
				c=sc.nextInt();
				
				if((a>=b)&&(a>=c))
				{
					System.out.println(a);
				}
				else if((b>=a)&&(b>=c))
				{
					System.out.println(b);
				}
				else 
				{
					System.out.println(c);
				}
				
				}
				catch(InputMismatchException ex)
				{
					System.out.println("Invalid Input");
				}
				
				
			

		
	}

}
