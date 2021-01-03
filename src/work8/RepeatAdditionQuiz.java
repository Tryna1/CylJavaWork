package work8;

//11.16
import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		//Create a ArrayList
		ArrayList <Integer> arlist = new ArrayList <Integer> ();
		arlist.add(-1);
		//Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print( 
				"What is " + number1 + " + " + number2 + "? ");
		//输入答案
		int answer = input.nextInt();
		//添加进数组列�?
		arlist.add(answer);
		while(number1 + number2 != answer) {
			System.out.print("Wrong answer. Try again. " + 
							" What is " + number1 + " + " + number2 + "? ");
			//输入答案
			answer = input.nextInt();
			if(arlist.contains(answer) == true)
				System.out.println("You already entered " + answer);
			arlist.add(answer);
		}
		
		System.out.println("You got it!");
	}

}
