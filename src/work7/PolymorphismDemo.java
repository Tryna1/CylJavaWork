package work7;
//11-5
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayObject(new CircleFromSimpleCeometricObject(1, "red", false));
		displayObject(new RectangleFromSimpleGeometricObject(1, 1, "black", true));
	}

	
	public static void displayObject(SimpleGeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() +
				". Color is " + object.getColor()); 
	}
}
