package ChekedException;
class VoterException extends Exception{
	String msg;
	VoterException(String msg) {
		this.msg=msg;
	}
	public String getMsg() {
		return msg;
	}
}

public class Voter {
	static void eligibity() throws VoterException {
		int age=16;
		if(age>=18) {
			System.out.println("Eligible");
		}
		else {
			throw new VoterException("Invalid");
		}
	}
	public static void main(String[] args) {
		try {
			eligibity();
		}
		catch(VoterException e) {
			System.out.println(e.getMsg());
		}
		
	}

}
