package recrusion;

public class FibonacciRecrusive {

	
	public static int fibonacciRecrusive(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacciRecrusive(n-1) + fibonacciRecrusive(n-2);
	}
	
	public static void main(String[] args) {
	
		System.out.println(fibonacciRecrusive(1000));
	}

}
