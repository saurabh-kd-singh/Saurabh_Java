package javaYT;
import java.util.Scanner;

public class MCQGame {

	public static void main(String[] args) {
		
		//Actual Questions:
		String s1 = "Q.1) What is the colour of an apple ?\na) Red \nb) Blue \nc) Yellow \nd) Pink \n";
		String s2 = "Q.1) What is the colour of an Banana ?\na) Red \nb) Blue \nc) Yellow \nd) Pink \n";
		String s3 = "Q.1) What is the colour of milk ?\na) Red \nb) Blue \nc) Yellow \nd) White \n";
		
		// Making an array of  questions and answers.
		// The array is of question class type.
		Question  qnsArray[] = { new Question(s1 , "a"), new Question(s2 , "c"),new Question(s3 , "d")};
		// Here each element of  the array is a new object of type Question Class.

		TakeTest(qnsArray);
	}
	
	public static void TakeTest(Question qnsArray[]) {
		int score =0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < qnsArray.length; i++)
		{
			System.out.println(qnsArray[i].prompt);
			String answer = sc.nextLine();
			if(answer.equals(qnsArray[i].answer)) 
			{
				score++;
			}
		}
		
		System.out.println("Your Score is : " + score + "/" + qnsArray.length);
		
	}
	
	
	
	

}
