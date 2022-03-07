package javaYT;
import java.util.Scanner;

public class GreatestNumOf3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First Number : ");
		int n1=sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int n2=sc.nextInt();
		System.out.print("Enter the Third Number : ");
		int n3=sc.nextInt();
		
		System.out.println("The greatest of all the numbers is : " + Greatest(n1, n2, n3));
	}
	
	public static int Greatest(int n1, int n2, int n3) {
		
		if(n1 >= n2) 
		{
			if(n1 >= n3) 
			{
				return n1;
			}
			else 
			{
				return n3;
			}
			
		}
		else
		{
			if(n2 >= n3) 
			{
				return n2;
			}
			else 
			{
				return n3;
			}
		}	
		
	}

}
