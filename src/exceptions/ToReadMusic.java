
package exceptions;
 

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;
 
public class ToReadMusic {
	private static final Pattern notes = Pattern.compile(
			"C,?|D,?|E,?|F,?|G,?|A,?|B,?|c'?|d'?|e'?|f'?|g'?|a'?|b'?"
			);
	
	public static void extractNotes() {
		Scanner sc;
		try {
			sc = new Scanner(Paths.get("music.txt"));
			PrintWriter pw = new PrintWriter("file2.txt");
			pw.write("M : C\n");
			pw.write("L : 1/4\n");
			pw.write("K : C\n \n");
			while(sc.hasNextLine()) {
				String nextNote = sc.nextLine();
				if(!nextNote.isEmpty()) {
					if(notes.matcher(nextNote).matches()) {
						pw.print(nextNote + " ");
						
					}
					
				}
			}
			sc.close();
			pw.close();
			
		} catch (IOException e) {
			System.out.println("Fehler");
		}
	}
	
	public static void main(String[] args) {
		extractNotes();
	}
}











