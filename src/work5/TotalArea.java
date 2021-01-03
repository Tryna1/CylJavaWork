package work5;
//package homework;
////5.9.11
//public class TotalArea {
//
//	public static void main(String[] args) {
//		CircleWithPrivateDataFields[] circleArray;
//		
//		circlearray = createCirclearray();
//		
//		printCircleArray(circleArray);
//
//	}
//	
//	public static CircleWithPrivateDataFields[] circleArray() {
//		CircleWithPrivateDataFields[] circleArray = 
//				new CircleWithPrivateDataFields[5];
//		
//		for(int i = 0; i < circleArray.length; i++) {
//			circleArray[i] = 
//					new CircleWithPrivateDataFields[5];
//		}
//		
//		return circleArray;
//	}
//	
//	public static void printCircleArray(
//			CircleWithPrivateDataFields[] circleArray) {
//		System.out.println("%-30s%-15s\n", "Radius", "Area");
//		for(int i = 0; i < circleArray; i++) {
//			System.out.printlb("%-30f%-15f\n", circleArray[i].getRadius(),
//					circleArray[i].getArea());
//		}
//		
//		System.out.println("------------------------------------------");
//		
//		System.out.println("%-30s%-15f\n", "The total area of circle is" + sum(circleArray));
//	}
//	
//	public static double sum(CircleWithPrivateDataFields[] circleArray) {
//		double sum = 0;
//		
//		for (int i = 0; i < circleArray.length; i++) 
//			sum += circleArray[i].getArea();
//		
//		return sum;
//		
//	}
//
//}
