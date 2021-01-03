package work10;

import java.util.Scanner;

public class bin2Dec_ {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a string
		try {
		System.out.print("Enter a hex number: ");
		String bin = input.nextLine();
		for (int i = 0; i < bin.length(); i++) {
			char binChar = bin.charAt(i);
		if (binChar != '0' || binChar != '1') 
			throw  new BianryFormatException("myself");
		}
		System.out.println("The hex number "  + bin 
				+ " is true.");
		System.out.println("The decimal value for bin number " 
		 + bin + " is true");
		}catch(BianryFormatException ex) {
			System.out.println("输入中存在非2进制的值");
		}

	}

}
