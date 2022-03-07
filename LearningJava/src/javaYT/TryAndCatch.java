package javaYT;

import java.util.Scanner;

public class TryAndCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.print("Enter a Number : ");
			int n = sc.nextInt();
			System.out.println("The entered number is : " + n);
			
		}
		catch(Exception e) {
			System.out.println("There was an Exception :" + e);
		}

	}

}
