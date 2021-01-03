package work9;
import java.util.*;

public class Text1 {

	public static void main(String[] args) {
		Book books1 = new Book(1, "java", 100.0, "java出版社");
		Book books2 = new Book(2, "c++", 75.0, "c版社");
		Book books3 = new Book(3, "python", 60.0, "python出版社");
		Book books4 = new Book(4, "多媒体", 250.0, "多媒体出版社");

		Map<Integer, Book> booksHashMap = new HashMap<>();
		
		booksHashMap.put(books1.getNum(), books1);
		booksHashMap.put(books2.getNum(), books2);
		booksHashMap.put(books3.getNum(), books3);
		booksHashMap.put(books4.getNum(), books4);
		
		System.out.println("编号\t名称\t单价\t出版社");
		Iterator iter = booksHashMap.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry entry = (Map.Entry)iter.next();
			System.out.println(entry.getKey() + "\t" + ((Book)entry.getValue()).getName() +
					"\t" + ((Book)entry.getValue()).getPrice() + "\t" + 
					((Book)entry.getValue()).getPress());
		}
	}

}
class Book{
	private int num;//编号
	private String name;//名称
	private double price;//单价
	private String press;//出版社
	
	public Book() {
		
	}
	Book(int num, String name, double price, String press) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.press = press;
	}
	
	int getNum() {
		return num;
	}
	String getName() {
		return name;
	}
	double getPrice() {
		return price;
	}
	String getPress() {
		return press;
	}
}