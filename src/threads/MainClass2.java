package threads;

class Demo implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		Demo d1= new Demo();
		d1.run();
		Thread t1=new Thread(d1);
//		t1.start();
		System.out.println(t1.getName());
		
		
	}

}
