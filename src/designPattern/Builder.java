package designPattern;

class Student1 {
	int stdid;
	String stdName;
	
	public Student1(StudentBuilder s1) {
		this.stdid=s1.stdid;
		this.stdName=s1.stdName;
	}
	@Override
	public String toString() {
		
		return stdid+" "+stdName;
	}
	
	static class StudentBuilder{
		int stdid;
		String stdName;
		public StudentBuilder setid(int stdid) {
			this.stdid=stdid;
			return this;
		}
		public StudentBuilder setName(String stdName) {
			this.stdName=stdName;
			return this;
		}
		public Student1 build() {
			return new Student1(this);
		}
	}
}
	public class Builder{
		public static void main(String[] args) {
			Student1 s2 = new Student1.StudentBuilder().setid(123).setName("King").build();
			System.out.println(s2.stdid);
			System.out.println(s2.stdName);
		}
	}


