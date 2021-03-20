package test;

public class Ex3 {

	public static void main(String[] args) {

		Ex3 e = new Ex3();
		try {
			e.operation();
		} catch (Exception e1) {
			System.out.println("Somethign went wrong");
		}

	}

	void operation() throws Exception {
		int a[] = { 2, 4, 5, 6 };
		int b = 10;
		int c=0;
		try {

			c=a[1] / b;
		} catch (Exception ae) {
			// System.out.println("index not found");
			throw ae;
		}finally {
		System.out.println("end : "+c);
		}
	}

}
