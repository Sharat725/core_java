package ChekedException;

class WhatsAppException extends Exception{
	String msg;
	WhatsAppException(String msg) {
		this.msg=msg;
	}
	public String getMesg() {
		return msg;
	}
}

public class WhatsApp {
	static void send() throws WhatsAppException{
		int size=4;
		if(size<=2) {
			System.out.println("Send");
		}
		else {
			throw new WhatsAppException("Invalid");
		}
	}
	public static void main(String[] args) {
		try {
		send();
		}
		catch(WhatsAppException e) {
			System.out.println(e.getMesg());
		}
	}

}
