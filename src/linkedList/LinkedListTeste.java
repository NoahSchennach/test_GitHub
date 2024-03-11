package linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Collections.rotate(list, 2);
		
		//"Laufvariable" zum Iterieren einer Datenstruktur0
		//läuft immer vom Anfang bis zum Ende
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			if(iterator.next()==3) {
				//System.out.println("found 3");
				iterator.remove();
			}
		}
		//iterator muss zurückgesetzt werden
		// iterator muss wieder an den Anfang der Liste gesetzt werden
		iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
	
		}
		
	}

}
