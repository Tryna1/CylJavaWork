//package homework;
//
//import java.util.Scanner;
//
//public class third_work {
//
//	public static void main(String[] args) {
//		System.out.println("123");
		//3.4
//		int number1 = (int)(Math.random()*12 + 1);
//		if(number1 == 1)
//		{
//			System.out.println("January");
//		}
//		else if (number1 == 2)
//		{
//			System.out.println("February");
//		}
//		else if(number1 == 3)
//		{
//			System.out.println("March");
//		}
//		else if(number1 == 4)
//		{
//			System.out.println("April");
//		}
//		else if(number1 == 5)
//		{
//			System.out.println("May");
//		}
//		else if(number1 == 6)
//		{
//			System.out.println("June");
//		}
//		else if(number1 == 7)
//		{
//			System.out.println("July");
//		}
//		else if(number1 == 8)
//		{
//			System.out.println("August");
//		}
//		else if(number1 == 9)
//		{
//			System.out.println("September");
//		}
//		else if(number1 == 10)
//		{
//			System.out.println("October");
//		}
//		else if(number1 == 11)
//		{
//			System.out.println("November");
//		}
//		else 
//			System.out.println("December");
		
		
		//3.9
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
//		int number = input.nextInt();
//		int ans = 0;
//		ans = number;
//		int sum = 0;
//		int flag = 9;
//		do {
//			sum += flag * (number % 10);
//			number = number / 10;
//			flag --;
//		} while(number > 0);
//		sum = sum % 11;
//		if(sum != 10)
//		{
//			ans = ans * 10 + sum;
//			System.out.println("The ISBN-10 number is " + "0" + ans);
//		}
//		else 
//		{
//			System.out.println("The ISBN-10 number is " + "0" + ans + "X");
//		}
		
		//3.15
//		Scanner input = new Scanner(System.in);
//		int number1 = input.nextInt();
//		int number2 = (int)(Math.random()*900 + 100);
//		int flag = 0;
//		int[] list1 = new int[3];
//		int[] list2 = new int[3];
//		int i = 0;
//		int j = 0;
//		int sum = 0;
//		if(number1 == number2)
//		{
//			System.out.println("10000");
//		}
//		else 
//		{
//			for(i = 0; i < 3; i++)
//			{
//				list1[i] = number1 % 10;
//				number1 = number1 / 10;
//				list2[i] = number2 % 10;
//				number2 = number2 /10;
//			}
//			for(i = 0; i< 3; i++)
//			{
//				for(j = 0; j < 3; j++)
//				{
//					if(list1[i] == list2[j])
//						sum ++;
//				}
//			}
//			if(sum == 3)
//			{
//				System.out.println("3000");
//			}
//			else if(sum != 0)
//			{
//				System.out.println("1000");
//			}
//			else 
//				System.out.println("0");
//		}
		
		
		//3.19
//		Scanner input = new Scanner(System.in);
//		int number1 = input.nextInt();
//		int number2 = input.nextInt();
//		int number3 = input.nextInt();
//		if(number1 + number2 > number3 && number1 + number3 > number3 && number2 + number3 > number1)
//		{
//			System.out.println(number1 + number2 + number3);
//		}
//		else 
//			System.out.println("输入不合法");
			
			
		//3.21
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter year: (e.g., 2012): ");
//		int year = input.nextInt();
//		System.out.println("Enter month: 1-12: ");
//		int m = input.nextInt();
//		System.out.println("Enter the day of the month: 1-31: ");
//		int q = input.nextInt();
//		if(m == 1)
//			{m = 13; year = year - 1;}
//		if(m == 2)
//			{m = 14; year = year - 1;}
//		double j = 0;
//		j = year / 100;
//		double k = year % 100;
//		double h = 0;
//		h = (1.0 * q + (26.0 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
//		if((int)h == 0)
//			System.out.println("Day of the week is Saturday");
//		else if((int)h == 1)
//			System.out.println("Day of the week is Sunday");
//		else if((int)h == 2)
//			System.out.println("Day of the week is Monday");
//		else if((int)h == 3)
//			System.out.println("Day of the week is Tuesday");
//		else if((int)h == 4)
//			System.out.println("Day of the week is Wednesday");
//		else if((int)h == 5)
//			System.out.println("Day of the week is Thursday");
//		else if((int)h == 6)
//			System.out.println("Day of the week is Friday");
		
		
		//3.22
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a point with two coordinates: ");
//		int x = input.nextInt();
//		int y = input.nextInt();
//		if(x * x + y * y < 100)
//			System.out.println("Point (" + x + ", " + y + ") is in the circle");
//		else
//			System.out.println("Point (" + x + ", " + y + ") is not in the circle");
		
		
		//3.23
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a point with two coordinates: ");
//		int x = input.nextInt();
//		int y = input.nextInt();
//		if(x < 5 && x > -5 && y < 2 && y > -2)
//			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
//		else
//			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
		
		
		//3.24
//		int x = (int)(Math.random()*13 + 1);
//		int y = (int)(Math.random()*4 + 1);
//		String a = "";
//		String b = "";
//		switch(x)
//		{
//		case 1: a = "Ace"; break;
//		case 2: a = "2"; break;
//		case 3: a = "3"; break;
//		case 4: a = "4"; break;
//		case 5: a = "5"; break;
//		case 6: a = "6"; break;
//		case 7: a = "7"; break;
//		case 8: a = "8"; break;
//		case 9: a = "9"; break;
//		case 10: a = "10"; break;
//		case 11: a = "Jack"; break;
//		case 12: a = "Queen"; break;
//		case 13: a = "King"; break;
//		}
//		switch(y)
//		{
//		case 1: b = "Clubs"; break;
//		case 2: b = "Diamonds"; break;
//		case 3: b = "Hearts"; break;
//		case 4: b = "Spades"; break;
//		}
//		System.out.println("The card you picked is " + a + " of " + b);	
		
		
		//3.27
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter a point's x- and y-coordinations: ");
//		double x = input.nextDouble();
//		double y = input.nextDouble();
//		if(y < -1 / 2 * x + 100)
//			System.out.print("The point is in the triangle");
//		else 
//			System.out.print("The point is not in the triangle");
	
//		
//		
//	}
//
//}








