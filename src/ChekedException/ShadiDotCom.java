package ChekedException;

class ShadiDotComException extends Exception{
	String msg;
	ShadiDotComException(String msg) {
		this.msg=msg;
	}
	
	public String getMsg() {
		return msg;
	}
}

public class ShadiDotCom {
	static void submit() throws ShadiDotComException{
		int age=16;
		if(age>=23) {
			System.out.println("Happy Life");
		}
		else {
			throw new ShadiDotComException("Invalid");
		}
	}
	public static void main(String[] args) {
		try {
			submit();
		}
		catch(ShadiDotComException e) {
			System.out.println(e.getMsg());
		}
		
	}

}
