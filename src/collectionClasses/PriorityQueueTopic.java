package collectionClasses;

import java.util.PriorityQueue;

public class PriorityQueueTopic {
	public static void main(String[] args) {
		PriorityQueue p1=new PriorityQueue();
		p1.add(50);
		p1.add(30);
		p1.add(10);
		p1.add(45);
		p1.add(20);
		p1.add(-2);
		p1.add(20);
		
//		p1.add(null);  we can't add null and we can't add heterogeneous
		System.out.println(p1);
//		p1.remove(20);
		
//		System.out.println(p1.size());
//		System.out.println(p1.contains(20));
		
//		p1.clear();
//		System.out.println(p1.size());
//		System.out.println(p1.isEmpty());
		
//		p1.remove();
//		System.out.println(p1);
		
		System.out.println(p1.peek());
		System.out.println(p1);
		System.out.println(p1.poll()); //affect the original array
		System.out.println(p1);

		
		PriorityQueue p2=new PriorityQueue();
		p2.add(10);
		p2.add(15);
		p2.add(35);
		p2.add(20);
		p2.add(25);
//		System.out.println(p2);
		
//		p1.addAll(p2);
//		System.out.println(p1);
		
//		p1.removeAll(p2);
//		System.out.println(p1);
		
//		p1.retainAll(p2);
//		System.out.println(p1);
		
		
		
	}

}
