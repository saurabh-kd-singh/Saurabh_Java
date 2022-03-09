package allBeginnersPrograms;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Armstrong a = new Armstrong();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		a.arm(n);
	}

	
//-------------------------------------------------------------------
	public void arm(int n) {
		int copy = n;
		int sum = 0;
		
		String s = Integer.toString(n);
		int len = s.length();
		
		for(int i=1; i<=len; i++) {
			int rem = copy%10;
			sum = sum + (int)Math.pow(rem, len);
			copy = (int)(copy/10);
		}
		
		if(sum == n)
			System.out.println("Armstrong");
		else
			System.out.println("Not armstrong");
	}
//-------------------------------------------------------------------
	
}
