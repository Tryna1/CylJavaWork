package work9;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.io.PrintStream;

public class Text2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Set<Student> stuSet = new TreeSet<Student>();
		System.out.println("输入学生的学号、姓名、年龄\n");
		while(true) {
			int num = input.nextInt();
			if(num == -1)break;
			String name = input.next();
			int age = input.nextInt();
			Student stu = new Student(num, name, age);
			}
		try {
			Iterator<Student> it = stuSet.iterator();
			String txt = "/Users/chnyl/eclipse-workspace/homework/src/work9/Students.txt";
			PrintStream ps = new PrintStream(txt);
			while(it.hasNext()) {
				String info = it.next().toString();
				System.setOut(ps);
				System.out.println(info);
			}
		}
		catch(Exception e) {
	}

}
}
class Student {
	private int num;
	private String name;
	private int age;
	
	public Student() {
		
	}
	Student(int num, String name, int age){
		this.num = num;
		this.name = name;
		this.age = age;
	}
	int getNum() {
		return num;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	public String toString() {
		return  "num=" + num + ", name=" + name + ", age=" + age;
	}
	
}