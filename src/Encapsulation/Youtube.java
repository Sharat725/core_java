package Encapsulation;

class Login3{
private String pwd="admin@123";
	
	public String getpwd() {
		return pwd;
	}
	
	public void setpwd(String pwd) {
		this.pwd=pwd;
	}
}
public class Youtube {
	public static void main(String[] args) {
		Login3 l1 = new Login3();
		System.out.println(l1.getpwd());
		l1.setpwd("Sh@123");
		System.out.println(l1.getpwd());
	 
	}
	

}
