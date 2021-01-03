package work7;
//11-7
public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object1 = new CircleFromSimpleCeometricObject(1);
		Object object2 = new RectangleFromSimpleGeometricObject(1, 1);
		
		displayObject(object1);
		displayObject(object2);
	}

	
	public static void displayObject(Object object) {
		if(object instanceof CircleFromSimpleCeometricObject) {
			System.out.println("The circle area is " +
					((CircleFromSimpleCeometricObject)object).getArea());
			System.out.println("The circle diameter is " +
					((CircleFromSimpleCeometricObject)object).getDiameter());
		}
		else if (object instanceof RectangleFromSimpleGeometricObject) {
			System.out.println("The rectangle area is " +
		((RectangleFromSimpleGeometricObject)object).getArea());
		}
	}
}
