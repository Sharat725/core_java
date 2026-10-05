package collectionClasses;

import java.util.LinkedHashSet;

public class LinkedHashSetTopic {
	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(10);
		l1.add(20);
		l1.add(true);
		l1.add(40);
		l1.add("hi");
		l1.add(60);
//		l1.add(2, 20); not indexed type of collection
		l1.add(null);
		System.out.println(l1);
		
//		l1.remove(null);
//		System.out.println(l1.size());
//		l1.clear();
//		System.out.println(l1.isEmpty());
//		System.out.println(l1.contains(20));
//		System.out.println(l1);
		
		
		LinkedHashSet l2=new LinkedHashSet();
		l2.add(10);
		l2.add(20);
		l2.add(true);
		l2.add(50);
		l2.add("hi");
		l2.add(60);
//		l2.add(2, 70);
		l2.add(null);
		System.out.println(l2);
		
//		l1.addAll(l2);
//		l1.removeAll(l2);
//		l1.retainAll(l2);
//		System.out.println(l1);
	}

}
