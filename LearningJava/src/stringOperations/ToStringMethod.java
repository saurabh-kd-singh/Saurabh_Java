package stringOperations;

//In java if you try to print the String object it will call by default the method toString();
//There is a predefinition of toString in java which will be called automatically.
//But, you can override the toString() method to perform some user defined task. 

public class ToStringMethod {

	public static void main(String[] args) {
			Student s1 = new Student(1 , "Saurabh");
			System.out.println(s1);
		}	
		
	 public static class Student {
		int rollNo;
		String sName;
		
		//Constructor for class student.
		public Student(int rollNo, String sName) {
			this.rollNo = rollNo;
			this.sName = sName;
		}
		
		//Overriding toString()
		public String toString() {
			return rollNo + " : " + sName;
		}	
	}
}
