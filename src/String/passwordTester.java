package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordTester {

	public static boolean isPasswordGood(String input) {
		
		
		Pattern p1 = Pattern.compile("[a-z]");
		Pattern p2 = Pattern.compile("[A-Z]");
		Pattern p3 = Pattern.compile("\\d+");
		Pattern p4 = Pattern.compile("[^a-zA-z0-9]");

		
		Matcher m1 = p1.matcher(input);
		Matcher m2 = p2.matcher(input);
		Matcher m3 = p3.matcher(input);
		Matcher m4 = p4.matcher(input);


		if(input.length() < 9) {
			return false;
		
		}else if(m1.find() && m2.find()&& m3.find() && m4.find()) {
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {

		System.out.println(isPasswordGood("Hallo123456!"));
	}

}
