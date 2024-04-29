package stack;

import java.util.LinkedList;

public class UE1 {

	
	public static String reverseString(String input) {

		//String reversedString = new StringBuilder(input).reverse().toString();
		//System.out.println("The original String was: " + input);
		//System.out.println("The reversed String is: " + reversedString);
		//return reversedString;
	
		LinkedList<Character> stack = new LinkedList<Character>();
		for(char c : input.toCharArray()) {
			stack.push(c);
		}
		StringBuilder reversedString = new StringBuilder();
		while(!stack.isEmpty()) {
			reversedString.append(stack.pop());
			
		}
		return reversedString.toString();
	}
	
	
	
	
	
	
	public static void main(String[]args) {
		
	//	reverseString("Muhammed");
	//	reverseString("Superdubimupi");
	
		System.out.println("HAAAAAAAAAAAAAAAAAAAAAAALLLLLLLLLLLLLLLLLOOOOOOOOOOOOO");
		System.out.println(reverseString("HAAAAAAAAAAAAAAAAAAAAAAALLLLLLLLLLLLLLLLLOOOOOOOOOOOOO"));
	}
}
