package array;

public class increasePicture {

	public static int[][] magnify(int[][]array, int factor){
		
		array = new int[2][3];
		
		 int newRows = array.length * 2;
	        int newCols = array[0].length * 2;
	        
	     int[][] newArray = new int[newRows][newCols];
	     
	    
	
	 for (int i = 0; i < newRows; i++) {
         for (int j = 0; j < newCols; j++) {
             System.out.print(newArray[i][j] + " ");
         }
         System.out.println();
     }
 }




	
	public static void main (String[]args) {
		
	}
}
