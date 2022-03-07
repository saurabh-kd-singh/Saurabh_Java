package interfaceInheritance;

public class InterfaceInheritanceExample {

	public static void main(String[] args) {
		
		Cow myCow = new Cow();
		myCow.eat();
		
		Animal myCow2 = new Cow();
		myCow2.eat();
		
		Animal animals[] = { new Cow(), new Dog(), new Bird() };
		
		for(int i=0; i<animals.length; i++) 
		{
			animals[i].eat();	
		}

	}

}
