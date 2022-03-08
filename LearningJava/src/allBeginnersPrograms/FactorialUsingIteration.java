package allBeginnersPrograms;
import java.util.Scanner;

public class FactorialUsingIteration 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find factorial : ");
		int n = sc.nextInt();
		
		FactorialUsingIteration f1 = new FactorialUsingIteration();
		int result = f1.fact(n);
		
		System.out.print("Factorial is :" + result);
	}
//--------------------------------------------------------------------------	
	int f=1;
	public int fact(int n) 
	{
		for(int i =1; i<=n; i++) 
		{
			f=f*i;
		}
		return f;
	}
//---------------------------------------------------------------------------
}
