package threads;



class Tester extends Thread{
	public void run() {
		for(int i=1; i<=10;i++) {
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class MainClass {
	public static void main(String[] args) {
		Tester t1= new Tester();
		t1.start();
	}

}
