package work5;

//5.9.9
public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		CircleWithPrivateFields myCircle = 
				new CircleWithPrivateFields(5.0);
		
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setradius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is "
				+ CircleWithPrivateFields.getNumberOfObjects());

	}

}
