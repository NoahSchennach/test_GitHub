package array;

public class Aufgabe1 {


		
		//int[] gains = new int [31];
		
		public static int count5PercentJumps(int[]gains) {
				int jumps =0;
			for(int i = 0; i<gains.length -1; i++) {
		if(gains.length < 2) {
					return -1;
				} else
				if(gains[i+1] > (gains[i])*1.05) {
			
					jumps++;
			}
		} return jumps;
	} 

		public static void main (String[]args) {
			int[]dailyGains = {1000, 2000, 500 , 9000 ,9010};
			
			System.out.println(count5PercentJumps(dailyGains));
		}
}
