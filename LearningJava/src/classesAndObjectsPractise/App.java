package classesAndObjectsPractise;

public class App {
	public  static void main(String[] args) {
		
		Book b1 = new Book();
		b1.title="Harry potter";
		b1.author="J.K Rowling";
		b1.pages=1000;
		b1.language="English";
		
		Book2 b2 = new Book2("Work", "J.J", 500 , "English");
		
		Student s1 = new Student();
		s1.firstName="Saurabh";
		s1.lastName="Singh";
		s1.cgpa=8.64;
		s1.course="CSE";
		
		System.out.println(String.format("Title=%s | Author=%s | Pages=%d | Language=%s |",b1.title ,b1.author, b1.pages, b1.language));
		System.out.println(String.format("Title=%s | Author=%s | Pages=%d | Language=%s |",b2.title ,b2.author, b2.pages, b2.language));
		System.out.println(String.format("FirstName=%s | LastName%s | CGPA=%.2f | Course=%s |",s1.firstName ,s1.lastName, s1.cgpa, s1.course));
		
		
		
	}
	
}
