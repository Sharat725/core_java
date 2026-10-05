package collectionClasses;

import java.util.LinkedList;

public class LinkedListTopic {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(true);
		l1.add(40);
		l1.add("hi");
		l1.add(60);
		l1.add(2, 20);
		l1.add(null);
		System.out.println(l1);
//		l1.remove(2);
//		l1.remove(null);
//		System.out.println(l1.size());
//		System.out.println(l1.contains(20));
//		l1.clear();
//		System.out.println(l1.size());
//		System.out.println(l1.get(2));
//		l1.set(2, false);
//		System.out.println(l1);
		
		LinkedList l2=new LinkedList();
		l2.add(10);
		l2.add(20);
		l2.add(true);
		l2.add(50);
		l2.add("hi");
		l2.add(60);
		l2.add(2, 70);
		l2.add(null);
		System.out.println(l2);
		
//		l1.removeAll(l2);
//		System.out.println(l1);
		
		l1.retainAll(l2);
		System.out.println(l1);
		
		
		
		
		
		
		

	}

}
