package Encapsulation;

class Login5{
private String pwd="admin@123";
	
	public String getpwd() {
		return pwd;
	}
	
	public void setpwd(String pwd) {
		this.pwd=pwd;
	}
}
public class Whatsapp {
	public static void main(String[] args) {
		Login5 l1 = new Login5();
		System.out.println(l1.getpwd());
		l1.setpwd("Sh@123");
		System.out.println(l1.getpwd());
	 
	}

}
