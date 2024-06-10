package exceptions;

public class Divide {

	public class DivisionHandler {

		  public static void divide(int zähler, int nenner) {
			  
			  try {
				int x = zähler;
				int y= nenner;
		    System.out.println(x/y); 
		    } catch ( final ArithmeticException e) {
		    	System.out.println("Division by zero is not allowed");
		      
		    }
		  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    divide(10,3);
	}

	}
}

