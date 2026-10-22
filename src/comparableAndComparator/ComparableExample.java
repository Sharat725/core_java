package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	String name;
	int id;
	public Student(String name, int id) {
		this.name = name;
		this.id=id;
	}
	
	@Override
	public String toString() {
		
		return id+" "+name;
	}
	@Override
	public int compareTo(Student o) {
		
//		return o.id-this.id;  //Descending order
//		return this.id-o.id;  //Ascending order
//		return o.name.compareTo(this.name);  //Descending order by name
		return this.name.compareTo(o.name);  //Ascending order by name
	}
}
public class ComparableExample {
	public static void main(String[] args) {
		ArrayList<Student> l=new ArrayList<Student>();
		l.add(new Student("Alex", 5));
		l.add(new Student("Bob", 1));
		l.add(new Student("Karthi", 2));
		l.add(new Student("Chidu", 4));
		l.add(new Student("Dinu", 3));
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		for(Student x:l) {
			System.out.println(x.id+ " "+x.name);
		}
		
	}

}
