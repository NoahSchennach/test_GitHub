package stack;

import java.util.LinkedList;
import java.util.List;

public class UE1 {

	
	public static String reverseString(String input) {
		//List<String> list = new LinkedList<String>();

		String reversedString = new StringBuilder(input).reverse().toString();
		
		System.out.println(reversedString);
		return reversedString;
	}
	
	
	
	
	
	public static void main(String[]args) {
		
		reverseString("Moin");
	
	}
}
