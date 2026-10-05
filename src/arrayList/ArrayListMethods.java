package arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(10.5);
		l1.add("hello");
		l1.add('A');
		l1.add(true);
//		System.out.println(l1);
		l1.add(2,50);
//		System.out.println(l1);
		
//		System.out.println(l1.size());
//		System.out.println(l1.isEmpty());
//		System.out.println(l1.get(2));
//		System.out.println(l1.contains("hello"));
		
//		l1.clear();
//		System.out.println(l1.size());
//		System.out.println(l1.isEmpty());
	
//		l1.remove(2);
//		l1.remove(true);
//		System.out.println(l1);
//		l1.set(2,"bye");
//		System.out.println(l1);
		
		ArrayList l2=new ArrayList();
		l2.add(10);
		l2.add(20);
		l2.add("hello");
		l2.add(false);
		l2.add('A');
		
//		l1.addAll(l2);
//		System.out.println(l1);
//		
//		l1.addAll(2, l2);
	System.out.println(l1);
		
//		l1.removeAll(l2);
//		System.out.println(l1);
		
	
		l1.retainAll(l2);
		System.out.println(l1);
	}

}
