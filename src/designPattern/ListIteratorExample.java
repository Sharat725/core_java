package designPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(20.18);
		l1.add('A');
		l1.add(true);
		
		ListIterator itr = l1.listIterator();
		while(itr.hasNext()) {
			Object o1=itr.next();
			System.out.println(o1);
		}
		
		while(itr.hasPrevious()) {
			Object o2=itr.previous();
			System.out.println(o2);
		}
	}

}
