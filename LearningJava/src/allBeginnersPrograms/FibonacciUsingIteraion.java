package allBeginnersPrograms;
import java.util.Scanner;

public class FibonacciUsingIteraion {

	public static void main(String[] args) 
	{
		FibonacciUsingIteraion f = new FibonacciUsingIteraion();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want in the series : ");
		int n = sc.nextInt();
		
		f.fib(n);

	}
//-------------------------------------------------------
	public void fib(int n) 
	{
		int a=0;
		int b=1;
		int temp;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for(int i=1; i<=n-2; i++) { 
			temp=a+b;
			System.out.print(temp + " ");
			a=b;
			b=temp;
			
		}
	}
//-------------------------------------------------------

}
