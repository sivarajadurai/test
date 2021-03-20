package test;

public abstract class ExceptExample {

	public static void main(String[] args) {
	
		int a = 1;
		int b = 0;
		
		int c=0;
		try {
		c= a/b;
		}catch(ArithmeticException e) {
			System.out.println("Something went wrong");
		}
		

		System.out.println("result " +c);
		
		
	}

}
