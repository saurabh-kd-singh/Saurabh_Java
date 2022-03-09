package dataStructures;
import java.util.ArrayList;

public class ArrayListDynamicArray {

	public static void main(String[] args) {	
		// ArrayList is an Dynamic Array . It Only Accepts The object Class.

		ArrayList<String> list = new ArrayList<>();
//----------------------------------------------------------------------
		list.add("Alex");
		list.add("John");
		list.add("Sam");
//----------------------------------------------------------------------
		for(String element : list) {
			System.out.print(element + " ");
		}
//----------------------------------------------------------------------
		list.remove(0);
		list.add(0, "Tom");
//----------------------------------------------------------------------
		System.out.println("\n");
//----------------------------------------------------------------------
		for(String element : list) {
			System.out.print(element + " ");
		}
//----------------------------------------------------------------------
		list.clear();
//----------------------------------------------------------------------
		for(String element : list) {
			System.out.print(element + " ");
		}
	
	}

}
