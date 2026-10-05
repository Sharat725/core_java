package Encapsulation;

class Login6{
private String pwd="admin@123";
	
	public String getpwd() {
		return pwd;
	}
	
	public void setpwd(String pwd) {
		this.pwd=pwd;
	}
}
public class SnapChat {
	public static void main(String[] args) {
		Login6 l1 = new Login6();
		System.out.println(l1.getpwd());
		l1.setpwd("Sh@123");
		System.out.println(l1.getpwd());
	 
	}

}
