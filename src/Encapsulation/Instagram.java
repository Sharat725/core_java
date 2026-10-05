package Encapsulation;

class Login1{
private String pwd="admin@123";
	
	public String getpwd() {
		return pwd;
	}
	
	public void setpwd(String pwd) {
		this.pwd=pwd;
	}
}
public class Instagram {
	public static void main(String[] args) {
		Login1 l1 = new Login1();
		System.out.println(l1.getpwd());
		l1.setpwd("Sh@123");
		System.out.println(l1.getpwd());
	}
}

