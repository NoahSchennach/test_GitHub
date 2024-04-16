package stack;


public class UE1 {

	
	public static String reverseString(String input) {

		String reversedString = new StringBuilder(input).reverse().toString();
		System.out.println("The original String was: " + input);
		System.out.println("The reversed String is: " + reversedString);
		return reversedString;
	}
	
	
	
	
	
	public static void main(String[]args) {
		
		reverseString("Muhammed");
		reverseString("Superdubimupi");
	}
}
