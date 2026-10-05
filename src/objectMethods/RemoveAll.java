package objectMethods;

import java.util.Arrays;

public class RemoveAll {
	static Object[] arr= {10,15,20,25,30};
	static Object[] abb= {10,20,30,40};
	
	static boolean contains(Object obj) {
		for(int i=0;i<abb.length;i++) {
			if(abb[i]!=null && abb[i].equals(obj))
				return true;
		}
		return false;
	}
	
	static void removeAll(Object[] arr) {
		for(int i=0;i<arr.length;i++) {
				if(contains(arr[i])) {
					arr[i]=null;
				}
		}
	}
	
	static void printing(Object[] obj) {
		for(int i =0;i<obj.length;i++) {
			if(obj[i]!=null) {
				System.out.println(obj[i]);
			}
		}
	}
	public static void main(String[] args) {
		removeAll(arr);
		printing(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
