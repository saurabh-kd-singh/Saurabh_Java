package allBeginnersPrograms;
import java.util.Scanner;


public class FibonacciUsingRecursion {

	public static void main(String[] args) 
	{
		FibonacciUsingRecursion f = new FibonacciUsingRecursion();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(0 + " ");
		
		int x;
		
		for(int i=0; i<n-1; i++) {
			x = f.fib(i);
			System.out.print(x + " ");
		}
	}
	
//-----------------------------------------------------------------------------
	public int fib(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else
			return (fib(n-1) + fib(n-2));
	}
//-----------------------------------------------------------------------------
}
