package stringOperations;
import java.util.Scanner;

public class PatternMatching {

	public static void main(String[] args) {
		
		String text , pattern;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text : ");
		text=sc.nextLine();
		System.out.println("Enter the pattern you want to check : ");
		pattern=sc.nextLine();
		
		//using Inbuilt Method
		boolean result = text.contains(pattern);
		if(result)
			System.out.println("Pattern Found");
		else
			System.out.println("Pattern Not Found");
		
		
		//Without using inbuilt method contain.
		int tlen = text.length();
		int plen = pattern.length();
		int count=0;
		//(tlen-plen) -> we don't have to check till the end for matching the first letter.
		//If the first letter of pattern does not match with a letter in text and we don't have enogh letters letter left of size plen
		//Then there is no meaning in matching the first letter of pattern to text.
		char c , p;

		for(int i=0; i<=(tlen-plen); i++) 
		{  
			c=text.charAt(i);
			p=pattern.charAt(0);
			
			if(c==p) 
			{
				for(int j=i,k=0 ; j<i+plen; j++,k++) 
				{
					c=text.charAt(j);
					p=pattern.charAt(k);
					
					if(c==p) 
						count++;
				}
			}
		}
		if(count==plen)
			System.out.println("Pattern Found");
		else
			System.out.println("Pattern Not Found");
		
		
	}

}
