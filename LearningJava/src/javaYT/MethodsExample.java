package javaYT;
import java.util.Scanner;

public class MethodsExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int l,b;
		
		System.out.println("Enter Length and Breadth : ");
		l=sc.nextInt();
		b=sc.nextInt();
		
		int Area = Rectangle(l,b);
		System.out.println("Area of the Rectangle is : "+ Area);
	}
	
	
	
	public static int Rectangle(int length, int breadth) {
		int Area = length * breadth;
		return Area;
	}
	
	

}
