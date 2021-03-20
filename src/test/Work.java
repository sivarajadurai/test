package test;

public class Work extends Thread {
	

	@Override
	public void run() {
		
		System.out.println("I am thread");
	}

	public static void main(String[] args) {
		Work w = new Work();
		w.start();
		for(int i=0;i<500;i++)
		System.out.println("This is main method");

	}

}
