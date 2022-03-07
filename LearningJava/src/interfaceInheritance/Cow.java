package interfaceInheritance;

public class Cow implements Animal {

	@Override
	public void speak() {
		System.out.println("Moooo");
		
	}

	@Override
	public void eat() {
		System.out.println("Eats Grass");
		
	}

}
