package Methods;

public class Function {

	public static void main(String[] args) {
		// f(x) = (x + 2) * 6;
		f(8);
		System.out.println("-------------SECOND METHODS-------------");
		power(2,4);

	}
	
	static void f(int x) {
		int result = (x + 2) * 6;
		System.out.println("Result: " + result);
	}
	
	static void power(int no1, int no2) {
		int result = 1;
		for (int i = 1; i <= no2; i++) {
			result *= no1;
		}
		System.out.println("Result: " + result);
	}
	
	

}
