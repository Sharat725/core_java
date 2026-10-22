package designPattern;

public class ProtoType implements Cloneable{
	int stdid;
	String stdname;
	char sec;
	public ProtoType(int stdid,String stdname,char sec) {
		this.stdid=stdid;
		this.stdname=stdname;
		this.sec=sec;
	}
	public ProtoType clone() {
		try {
			return (ProtoType) super.clone();
		} catch (CloneNotSupportedException e) {
			
		}
		return null;
	}
	public static void main(String[] args) {
		ProtoType org = new ProtoType(123, "King", 'A');
		ProtoType copy = org.clone();
		System.out.println(org==copy);
		
	}

}
