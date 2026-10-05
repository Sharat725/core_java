package Encapsulation;

class Login4{
private String pwd="admin@123";
	
	public String getpwd() {
		return pwd;
	}
	
	public void setpwd(String pwd) {
		this.pwd=pwd;
	}
}
public class Telegram {
	public static void main(String[] args) {
		Login4 l1 = new Login4();
		System.out.println(l1.getpwd());
		l1.setpwd("Sh@123");
		System.out.println(l1.getpwd());
	 
	}

}
