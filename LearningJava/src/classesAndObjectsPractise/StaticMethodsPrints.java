package classesAndObjectsPractise;

public class StaticMethodsPrints {

	public static void main(String[] args) {
		
		//Since the sayGoodye() method of prints class is static we do not need to create an object.
		//we can directly use the sayGoodbye() method of Prints class.
		//Same can be done with static attributes.
		
		Prints.sayGoodbye();
		
		System.out.println(Prints.count);

	}

}
