package work10;
import java.util.Scanner;

public class Hex2Dec {

	public static void main(String[] args) {
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a string
		try {
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		
		System.out.println("The decimal value for hex number " 
		 + hex + " is " + hexToDecimal(hex.toUpperCase()));
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.toString());
		}
	}
	
	
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) {
		if (ch > 'F') 
			throw new NumberFormatException("输入中存在非16进制的值");
		else if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else 
			return ch - '0';
		
	}

}
