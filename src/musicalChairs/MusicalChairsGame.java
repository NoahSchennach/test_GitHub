package musicalChairs;

public class MusicalChairsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MusicalChairs mc1 = new MusicalChairs("Lisa", "Susi","Tom");
		System.out.println(mc1);
		
		MusicalChairs mc2 = new MusicalChairs("Streeter", "Rainerus","Hofgartner");
		System.out.println(mc2);
		
		mc1.rotate(2);
		System.out.println(mc1);
		
		mc1.rotateAndRemove(2);
		
	}

}
