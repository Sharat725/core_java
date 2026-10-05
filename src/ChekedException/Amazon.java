package ChekedException;
class AmazonException extends Exception{
	String msg;
	AmazonException(String msg) {
		this.msg=msg;
	}
	public String getMesg() {
		return msg;
	}
}

public class Amazon {
	static void order() throws AmazonException{
		int price=4999;
		if(price >= 5000) {
			System.out.println("Offer");
		}
		else {
			throw new AmazonException("Invalid");
		}
	}
	public static void main(String[] args) {
		try {
		order();
		}
		catch(AmazonException e) {
			System.out.println(e.getMesg());
		}
	}

}
