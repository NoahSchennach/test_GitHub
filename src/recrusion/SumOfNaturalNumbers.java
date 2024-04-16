package recrusion;

public class SumOfNaturalNumbers {

	public static int sumOfNaturalNumbers(int n) {
		if(n == 0) {
			return n;
		}
		else { 
			return n+ sumOfNaturalNumbers(n-1);
		}
	}
	
	
	public static void main(String[] args) {

		System.out.println(sumOfNaturalNumbers(10));
	}

}
