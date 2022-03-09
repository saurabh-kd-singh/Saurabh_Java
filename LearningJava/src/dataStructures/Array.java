package dataStructures;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) 
	{
//-------------------------------------------------------------		
		int[] arr1 = new int[5];  // Initializing method 1
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
//-------------------------------------------------------------
		
		int[] arr2 = {11,12,13,14,15};  //  Initializing method  2
		
//-------------------------------------------------------------
		
		int[] copyArr = Arrays.copyOf(arr2, arr2.length);  // creating a copy without disturbing the elements of original array
		
//-------------------------------------------------------------
		
		for(int i=0;  i <arr1.length; i++) {  //Element access method 1
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
//-------------------------------------------------------------		
		
		for(int element : arr2) {                // Element access method 2
			System.out.print(element + " ");
		}
		
		System.out.println();
//-------------------------------------------------------------	
		
		for(int element : copyArr) {                // Element access method 2
			System.out.print(element + " ");
		}
		
	}

}
