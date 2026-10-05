package Encapsulation;

class Login7{
private String pwd="admin@123";
	
	public String getpwd() {
		return pwd;
	}
	
	public void setpwd(String pwd) {
		this.pwd=pwd;
	}
}
public class Twitter {
	public static void main(String[] args) {
		Login7 l1 = new Login7();
		System.out.println(l1.getpwd());
		l1.setpwd("Sh@123");
		System.out.println(l1.getpwd());
	 
	}

}
