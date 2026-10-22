package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1 {
	String name;
	int id;
	public Student1(String name, int id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		
		return name+" "+id;
	}
	
}
class SortById implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.id-o2.id;
	}
	
}
class SortByName implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
public class ComparatorExample {
	public static void main(String[] args) {
		ArrayList<Student1> l1=new ArrayList<Student1>();
		l1.add(new Student1("Alex", 5));
		l1.add(new Student1("Bob", 1));
		l1.add(new Student1("Karthi", 2));
		l1.add(new Student1("Chidu", 4));
		l1.add(new Student1("Dinu", 3));
		
		System.out.println(l1);
		Collections.sort(l1,new SortById());
		System.out.println(l1);
		
		Collections.sort(l1,new SortByName());
		for(Student1 x:l1) {
		System.out.println(x.id+" "+x.name);
		}
		
		
	}

}
