package collectionClasses;

import java.util.TreeSet;

public class TreeSetTopic {
	public static void main(String[] args) {
		TreeSet l1=new TreeSet();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
//		l1.add(2, 20); not indexed type of collection
//		l1.add(null); we cant store null and dublicate
		System.out.println(l1);
		
	
//		l1.remove(20);
//		System.out.println(l1.size());
//		l1.clear();
//		System.out.println(l1.isEmpty());
//		System.out.println(l1.contains(20));
//		System.out.println(l1);
		
		
		TreeSet l2=new TreeSet();
		l2.add(10);
		l2.add(20);
		l2.add(70);
		l2.add(50);
		l2.add(80);
		l2.add(60);
//		l2.add(2, 70);
//		l2.add(null); we cant store null and dublicate
		System.out.println(l2);
		
//		l1.addAll(l2);
//		l1.removeAll(l2);
//		l1.retainAll(l2);
//		System.out.println(l1);
	}

}
