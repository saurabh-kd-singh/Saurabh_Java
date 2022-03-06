package javaYT;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		
		//We can use the square brackets to declare array.
		//Square brackets can be placed either with the Data-Type or with the name of the array.
		String[] names = {"Shweta", "Saurabh", "Shivam", "Pihu"};
		String names2[] = new String[3];
		
		
		int Arr[];  //This declaration only creates a reference of arrays.
		Arr = new int[10]; //Memory allocated.
		
		int Arr2[] = new int[10]; // declaration and Memory allocation
		
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter the size of array : ");
		size = sc.nextInt();
		
		int Array[] = new int[size];
		
		System.out.println("Enter the elments of the array :");
		for(int i=0; i < size ; i++) {
			Array[i]=sc.nextInt();
		}
		
		System.out.print("The Array elements are ");
		for(int m : Array) {
			System.out.print(m + " | ");
		}
			
		
		
		
	}

}
