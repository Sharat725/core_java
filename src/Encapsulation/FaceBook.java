package Encapsulation;
class Login{
	private String pwd="admin@123";
	
	public String getpwd() {
		return pwd;
	}
	
	public void setpwd(String pwd) {
		this.pwd=pwd;
	}
}
public class FaceBook {
	public static void main(String[] args) {
		Login l1 = new Login();
		System.out.println(l1.getpwd());
		l1.setpwd("Sh@123");
		System.out.println(l1.getpwd());
	}

}
