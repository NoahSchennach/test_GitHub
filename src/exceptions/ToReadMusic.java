
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
			
			while(sc.hasNextLine()) {
				String nextNote = sc.nextLine();
				if(!nextNote.isEmpty()) {
					if(notes.matcher(nextNote).matches()) {
					System.out.print(nextNote + " ");
					}
					
				}
			}
			sc.close();
			
		} catch (IOException e) {
			System.out.println("Fehler");
		}
	}
	public static void main(String[] args) {
		extractNotes();
	}
}