package Practice;

class A extends Thread{
	public void run() {
		for(int i=0;i<11;i++)
		System.out.println("in A class " + i);
	}
}
class B extends Thread{
	public void run() {
		for(int i=0;i<11;i++)
		System.out.println("in B class " + i);
	}
}

public class Practice {
	public static void main(String[] args) {
		Thread t1 = new Thread(new A());
		Thread t2 = new Thread(new B());
		
		t1.start();
		t2.start();
	}
}
