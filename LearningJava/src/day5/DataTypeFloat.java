package day5;

public class DataTypeFloat {
	
	public static void main(String[] args) {
		int a = 10/3;
		float b = 10f/3f;
		double c = 10d/3d;
		System.out.println("Integer = "+ a);
		System.out.println("Float = "+ b);
		System.out.println("Double = "+ c);
		
		System.out.println("Setting Precision :");
		System.out.format("Float value after precision = %.3f",b);
		System.out.println();
		System.out.format("Double Value after precision = %.6f",c);
		
	}

}
