package stringOperations;
import java.util.Scanner;

public class StringOp {

	public static void main(String[] args) {
		String s1, s2, s3;
		
	    Scanner	sc= new Scanner(System.in);
	    System.out.println("Enter two Strings :");
	    
	    s1 = sc.nextLine();
	    s2 = sc.nextLine();
	    
	    //Concatenation
	    s3=s1.concat(s2);
	    System.out.println("Concatenation using Concat() method of String :"+s3);
	    System.out.println("Concatenation using + Operator :" + s1 + s2);
	    
	    //Length Finding
	    int l1=s1.length();
	    int l2=s2.length();
	    System.out.println("Length of first string is : " + l1);
	    System.out.println("Length of Second string is : " + l2);

	    //Upper Case and Lower case
	    s1=s1.toUpperCase();
	    s2=s2.toLowerCase();
	    System.out.println("String 1 in Upper case : " + s1);
	    System.out.println("String 2 in Lower case : " + s2);
	}

}
