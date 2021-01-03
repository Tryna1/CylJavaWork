package work10;

import java.util.Scanner;

public class test10_JVM {

	public static void main(String[] args) {
		int size = 5;
		int [] a = new int[size];
		//create a Scanner
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter a  array: ");
			for (int i = 0; i < 6; i++) {
				if(i > size - 1)
					throw new OutOfMemoryError("mtself");
				a[i] = input.nextInt();
			}
		}catch(OutOfMemoryError ex) {
			System.out.println("数组越界");
		}

}
}