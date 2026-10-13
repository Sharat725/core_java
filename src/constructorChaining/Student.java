package constructorChaining;

public class Student {
	String name;
	String college;
	String branch;
	public Student(String name) {
		this(name,"PU");
	}
	public Student(String name,String college) {
		this(name,college,"CSE");
	}
	public Student(String name,String college,String branch) {
		this.name=name;
		this.college=college;
		this.branch=branch;
		
	}
	public static void main(String[] args) {
		Student s1 = new Student("Sharat");
		System.out.println(s1.name+" "+s1.college+" "+s1.branch);
	}

}
