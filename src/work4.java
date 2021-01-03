

//import java.util.Scanner;
//
//public class work4 {
//
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//7.3
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the integers betreen 1 to 100: ");
//		int[] a = new int[100];
//		for(int i =0; i < 100; i ++)
//		{
//			a[i] = 0;
//		}
//		while(true)
//		{
//			int x = input.nextInt();
//			if(x == 0) break;
//			a[x]++;
//		}
//		for(int i =0; i < 100; i ++)
//		{
//			if(a[i] != 0)
//				System.out.println(i + " occurs " + a[i] + " times");
//		}
		
		
		
		//7.5
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the integers betreen 1 to 100: ");
//		int[] a = new int[100];
//		int number = 0;
//		int flag = 0;
//		int[] b = new int[11];
//		for(int i =0; i < 100; i ++)
//		{
//			a[i] = 0;
//		}
//		for(int i = 0; i < 10; i++)
//		{
//			int x = input.nextInt();
//			if(a[x] == 0)
//			{
//				a[x]++;
//				number++;
//				b[flag] = x;
//				flag++;
//			}	
//		}
//		System.out.println("The number of distinct number is " + number);
//		System.out.print("The distinct numbers are: ");
//		for(int i = 0; i < flag; i++)
//		{
//			System.out.print(b[i] + " ");
//		}
		
		
		//7.18
//		Scanner input = new Scanner(System.in);
//		double[] a = new double[11];
//		double flag = 0;
//		for(int i = 0; i < 5; i++)
//		{
//			a[i] = input.nextDouble();
//		}
//		for(int i = 0; i< 3; i++)//maoapo
//		{
//			for(int j = i; j < 4; j++)
//			{
//				if(a[j] > a[j + 1])
//				{
//					flag = a[j];
//					a[j] = a[j + 1];
//					a[j + 1] = flag;
//				}
//			}
//		}
//		for(int i = 0; i< 5; i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
		//7.19
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter List: ");
//		int x = input.nextInt();
//		int[] List = new int[x];
//		int flag = 0;
//		int flag1 = 0;
//		for(int i = 0; i < x; i++)
//		{
//			List[i] = input.nextInt();
//		}
//		if(List[1] - List[0] >= 0)
//			flag = 1;
//		for(int i = 1; i< x; i++)
//		{
//			if(List[i] - List[i - 1] >= 0)
//				flag1 = 1;
//			if(flag != flag1)
//			{
//				System.out.print("The list is not sorted");
//				return;
//			}
//		}
//		System.out.print("The list is already sorted");
		
		//7.23
//		Scanner input = new Scanner(System.in);
//		int[] a = new int[100];
//		int i,j;
//		for(i = 0; i < 100; i++)
//			a[i] = 1;
//		
//		for(i = 1; i < 100; i++)
//		{
//			int flag = i + 1;
//			for(j = 0; j < 100; j++)
//			{
//				if(i == 1 && Math.abs(j - i)%flag == 0)
//				a[j] = 0;
//				if(Math.abs(j - i)%flag == 0)
//				{
//					if(a[j] == 1) a[j] = 0;
//					else a[j] = 1;
//				}
//			}
//		}
//		for(i = 0; i < 100; i++)
//		{
//			if(a[i] == 1)
//			System.out.print(i + " ");
//		}
//7.31
//		Scanner input = new Scanner(System.in);
//		int i, j,flag;
//		System.out.print("Enter listl: ");
//		int x = input.nextInt();
//		int[] a = new int[x];
//		for(i = 0; i < x; i++)
//			a[i] = input.nextInt();
//		
//		System.out.print("Enter list2: ");
//		int y = input.nextInt();
//		int[] b = new int[y];
//		for(i = 0; i < y; i++)
//			b[i] = input.nextInt();
//		int z = x + y;
//		int[] c = new int[z];
//		for(i = 0; i < x; i++)
//		{
//			c[i] = a[i];
//		}
//		for(i = x, j = 0; i < z; i++, j++)
//		{
//			c[i] = b[j];
//		}
//		for(i = 0; i < z; i++)
//		{
//			for(j = i; j < z; j++)
//			{
//				if(c[i] > c[j])
//				{
//					flag = c[i];
//					c[i] = c[j];
//					c[j] = flag;
//				}
//			}
//		}
//		System.out.print("The merged list is ");
//		for(i = 0; i < z; i++)
//			System.out.print(c[i] + " ");
//		
//	}
//
//}
























