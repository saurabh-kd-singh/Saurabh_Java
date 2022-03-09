package allBeginnersPrograms;
import java.util.Scanner;

public class PrimeNumberInARange {

	public static void main(String[] args) {
		PrimeNumberInARange p = new PrimeNumberInARange();
		Scanner sc = new Scanner(System.in);
		
		int start, end;
		System.out.print("Enter the Start : ");
		start = sc.nextInt();
		System.out.print("\nEnter the end :");
		end = sc.nextInt();
		sc.close();
		
		p.CheckPrimeInaRange(start , end);	
	}
	
//-------------------------------------------------------------	
	public void CheckPrimeInaRange(int start, int end) 
	{
		for(int i=start; i<=end ; i++) 
		{
			int count = 0;
			
			for(int j=2; j<= Math.sqrt(i); j++) 
			{
				if(i%j == 0) count++;
			}
			if((count == 0) && (i != 1)) System.out.print(i + " ");
		}
	}
//--------------------------------------------------------------
}
