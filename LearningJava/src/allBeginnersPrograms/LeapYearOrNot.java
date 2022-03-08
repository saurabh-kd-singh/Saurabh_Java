package allBeginnersPrograms;
import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		
		int c = 1;
		
		while(c == 1){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Year : ");
			int n = sc.nextInt();
			
			LeapYearOrNot LP = new LeapYearOrNot();
			LP.Leap(n);
			
			System.out.println("\nDo you want to check again :\na)1 \nb)0 \n");
			c = sc.nextInt();
		}
	}
//---------------------------------------------------
	public void Leap(int n) {
		
		if(n%100 == 0)
			if(n%400 == 0)
				System.out.print("Leap Year");
			else
				System.out.print("Not a Leap Year");
		else if(n%4 == 0)
			System.out.print("Leap Year");
		else
			System.out.print("Not a Leap Year");
	}
//--------------------------------------------------
}
