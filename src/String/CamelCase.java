package String;

public class CamelCase {

	public static String camelCaseSplitter(String str){
		StringBuilder sb = new StringBuilder();
		boolean prevUpperCase = false;
		 
		for(char c : str.toCharArray()) {
			if((Character.isUpperCase(c) && !prevUpperCase)){
				sb.append(" ");
			}
		 sb.append(c);
		 prevUpperCase = Character.isUpperCase(c);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		System.out.println(camelCaseSplitter("HalloHallo"));
		System.out.println(camelCaseSplitter("IsThisRight"));
		System.out.println(camelCaseSplitter("HALLLOO"));
	}

}
