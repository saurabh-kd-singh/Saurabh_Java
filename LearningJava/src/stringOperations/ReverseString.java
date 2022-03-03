package stringOperations;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		//Method 1  to reverse a string using Logic.
		String org, rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		org = sc.nextLine();
		
		int len = org.length();
		
		for(int i=(len-1); i>=0; i--) {
			rev = rev + org.charAt(i);
		}
		System.out.println("Original string : " + org);
		System.out.println("Reversed string : " + rev);
		
		
		//Method 2 to reverse a string using Standard java API by creating an object of StringBuffer
		StringBuffer sb = new StringBuffer(org);
		rev = sb.reverse().toString();
		
		System.out.println("Original string : " + org);
		System.out.println("Reversed string : " + rev);
		
	}

}
