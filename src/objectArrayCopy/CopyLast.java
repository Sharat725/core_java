// arr={10,20,30,40,50}
// abb={A,B,C,D}

package objectArrayCopy;

public class CopyLast {
	static Object[] arr=new Object[10];
	static Object[] abb=new Object[10];
	
	static int index=0;
	static void add(Object[] obj, Object val) {
		obj[index++]=val;
	}
	
	static int jindex=0;
	static void add1(Object[] obj, Object val) {
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
	
	
	static void add(Object[] arr,Object[] abb) {
		System.arraycopy(arr, 0, abb, size(abb), size(arr));
	}
	
	static void printing(Object[] obj) {
		for(int i=0;i<obj.length;i++) {
			if(obj[i]!=null)
			System.out.println(obj[i]);
		}
	}
	
	public static void main(String[] args) {
		add(arr,10);
		add(arr,20);
		add(arr,30);
		add(arr,40);
		add(arr,50);
		add1(abb,'A');
		add1(abb,'B');
		add1(abb,'C');
		add1(abb,'D');
		add(arr,abb);
		printing(abb);
		
	}

}
