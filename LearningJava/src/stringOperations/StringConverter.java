package stringOperations;
import java.util.Scanner;

public class StringConverter {
	//65fg5f6 --> 6556
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter any alphanumeric value (may or may not include operators) : ");
		 String str = sc.nextLine();
		 
		 str = Convert(str);
		 System.out.println(str);	
	}
	
	public static String Convert(String str) {
		
		StringBuffer sb = new StringBuffer(str);
		
		for(int i=0; i<sb.length(); i++) {
			
			if(sb.charAt(i)<48 || sb.charAt(i)>57) {  // ASCII value of numbers from 0 to 9 is 48 to 57
				sb.deleteCharAt(i);
				i--;  // we need to reduce the index because every time we delete a char the length of total string decreases.
			}
		}		
		return sb.toString();
	}
}
