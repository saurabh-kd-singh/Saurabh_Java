package stringOperations;

public class StringCommaSeparatedValue {

	public static void main(String[] args) {
		
		String str = "Shweta, Saurabh, Shivesh, Pihu";
		
		String name[] = str.split(", ");
		
		System.out.println(name[2]);
		

	}

}
