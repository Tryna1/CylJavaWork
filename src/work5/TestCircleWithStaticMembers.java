package work5;

//5.9.7
public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " +
				CircleWithStaticMembers.numberOfObjects);
		
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();
		System.out.println("\nAfter creating c1");
		System.out.println("cl: radius C" + c1. radius + 
				") and number of Circle objects (" +
				c1.numberOfObjects + ")");
		
		CircleWithStaticMembers c2 = new CircleWithStaticMembers();
		
		c1.radius = 9;
		
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius C" + c1. radius + 
				") and number of Circle objects (" +
				c1.numberOfObjects + ")");
		System.out.println("c2: radius C" + c2. radius + 
				") and number of Circle objects (" +
				c2.numberOfObjects + ")");
				
	}

}
