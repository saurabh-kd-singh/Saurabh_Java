package stringOperations;
import java.util.Scanner;

public class StringMutation {

	public static void main(String[] args) {
		
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		input = sc.nextLine();
		
		StringBuffer sbf = new StringBuffer(input);
		
		sbf.append(" Appended");
		System.out.println("After Appending : " + sbf);
		
		sbf.replace(0, 7, "Pihu");
		System.out.println("After Replacinng : " + sbf);
		
		sbf.delete(0, 4);
		System.out.println("After Deleting : " + sbf);
		
		String subs = sbf.substring(4, 7);
		System.out.println("Substring : " + subs);
		
		
	}

}
