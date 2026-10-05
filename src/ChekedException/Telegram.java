package ChekedException;


class TelegramException extends Exception{
	String msg;
	TelegramException(String msg) {
		this.msg=msg;
	}
	public String getMsg() {
		return msg;
	}
}

public class Telegram {
	static void download() throws TelegramException{
		int size=6;
		if(size<=4) {
			System.out.println("Download");
		}
		else {
			throw new TelegramException("Invalid");
		}
	}
	public static void main(String[] args) {
		try {
		download();
		}
		catch(TelegramException e) {
			System.out.println(e.getMsg());
		}
	}

}
