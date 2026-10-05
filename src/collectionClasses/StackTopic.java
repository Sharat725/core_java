package collectionClasses;

import java.util.Stack;

public class StackTopic {
	public static void main(String[] args) {
		Stack p1=new Stack();
		p1.add(50);
		p1.add(30);
		p1.add(10);
		p1.add(45);
		p1.add(20);
		p1.add(-2);
		p1.add(20);
		p1.add(null);  
		p1.add(1, 40);
		System.out.println(p1);
//		p1.remove(2);
		
//		System.out.println(p1.size());
//		System.out.println(p1.contains(20));
		
//		p1.clear();
//		System.out.println(p1.size());
//		System.out.println(p1.isEmpty());
		
//		System.out.println(p1.get(3));
//		p1.set(2, 50);
		
//		System.out.println(p1.peek());
//		System.out.println(p1.capacity());
//		System.out.println(p1.poll()); //affect the original array
//		System.out.println(p1);
		
//		p1.push(60);
//		System.out.println(p1);
//		p1.pop();
//		System.out.println(p1);

		
		Stack p2=new Stack();
		p2.add(10);
		p2.add(15);
		p2.add(35);
		p2.add(20);
		p2.add(25);
		System.out.println(p2);
		
//		p1.addAll(p2);
//		System.out.println(p1);
		
//		p1.addAll(2, p2);
//		System.out.println(p1);
		
//		p1.removeAll(p2);
//		System.out.println(p1);
		
//		p1.retainAll(p2);
//		System.out.println(p1);
		
	}

}
