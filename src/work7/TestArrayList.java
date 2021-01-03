package work7;
//11-8
import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cityList = new ArrayList<>();
		
		cityList.add("london");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		
		System.out.println("List size? " + cityList.size());
		System.out.println("The Miami in the list? " + 
				cityList.contains("Miami"));
		System.out.println("Is the list empty? " + 
				cityList.isEmpty());
		
	}

}
