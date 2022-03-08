package allBeginnersPrograms;
import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		
		FactorialUsingRecursion f1 = new FactorialUsingRecursion();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		int result = f1.fact(n);
		
		System.out.print("The factorial is : " + result);
	}
	
	public int fact(int n) {
		if(n==0 || n==1)
			return 1;
		else return ( n*fact(n-1) );
	}
}
