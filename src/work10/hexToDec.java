package work10;

import java.util.Scanner;

public class hexToDec {

	public static void main(String[] args) {
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a string
		try {
			System.out.print("Enter a hex number: ");
			String hex = input.nextLine();	
			for (int i = 0; i < hex.length(); i++) {
				char hexChar = hex.charAt(i);
			if (hexChar > 'F') 
				throw  new HexFormatException("myself");
			}
			System.out.println("The hex number "  + hex 
					+ " is true.");
		}
		catch(HexFormatException ex) {
			System.out.println("输入中存在非16进制的值");
		}
		
	}
}
