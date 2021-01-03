package work10;

import java.util.Scanner;

public class bin2Dec {

	public static void main(String[] args) {
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a string
		try {
		System.out.print("Enter a hex number: ");
		String bin = input.nextLine();
		
		System.out.println("The decimal value for bin number " 
		 + bin + " is " + binToDecimal(bin.toUpperCase()));
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.toString());
		}

	}
	
	public static int binToDecimal(String bin) {
		int decimalValue = 0;
		for (int i = bin.length() - 1, flag = 0; i >= 0; i--, flag++) {
			char binChar = bin.charAt(i);
			decimalValue += binCharToDecimal(binChar) *  Math.pow(2, flag);
		}
		return decimalValue;
	}
	
	public static int binCharToDecimal(char ch) {
		if (ch != '0' && ch != '1') 
			throw new NumberFormatException("输入中存在非2进制的值");
		else 
			return ch - '0';
		
	}

}
