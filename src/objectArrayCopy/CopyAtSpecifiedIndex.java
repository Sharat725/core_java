// arr={10,20,30,40,50}
// abb={A,B,C,D}

package objectArrayCopy;

public class CopyAtSpecifiedIndex {
	static Object[] arr=new Object[10];
	static Object[] abb=new Object[10];
	
//	static void add(Object[] obj, Object val) {
//		int index=size(obj);
//		obj[index++]=val;
//	}
	
	static int index=0;
	static void add1(Object[] obj, Object val) {
		obj[index++]=val;
	}
	
	static int jindex=0;
	static void add2(Object[] obj, Object val) {
		obj[jindex++]=val;
	}
	
	static int size(Object[] obj) {
		int count=0;
		for(int i=0;i<obj.length;i++) {
			if(obj[i]!=null)
				count++;
		}
		return count;
	}
	
	
	static void add(Object[] arr,Object[] abb,int index) {
		System.arraycopy(abb, index, abb, abb.length-(size(abb)-index), size(abb)-index);
		System.arraycopy(arr, 0, abb, index, size(arr));
	}
	
	static void printing(Object[] obj) {
		for(int i=0;i<obj.length;i++) {
//			if(obj[i]!=null)
			System.out.println(obj[i]);
		}
	}
	
	public static void main(String[] args) {
		add1(arr,10);
		add1(arr,20);
		add1(arr,30);
		add1(arr,40);
		add1(arr,50);
		
		add2(abb,'A');
		add2(abb,'B');
		add2(abb,'C');
		add2(abb,'D');
		
		add(arr,abb,2);
		printing(abb);
		
	}


}
