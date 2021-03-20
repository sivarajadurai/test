package test;

public class Ex2 {

	public static void main(String[] args) {
		int a[]= {2,4,5,6};
		int b=0;
		
		try {

			System.out.println(a[4]/b);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("index not found");
		}catch(Exception ae) {
			System.out.println("cannnot divide by zero");
		}
		
		System.out.println("end");
	}

}
