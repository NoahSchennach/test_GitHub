package linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	//static - von der KLasse abhängig und nicht vom Objekt
	// aufrufen statischer Metohsen - Klassenname.Methodenname(); | Math.random(); | system.out.println(); |
	//															  | Arrays.asList(); |
	// private - Sichtbarkeitsbereich auf KLasse beschränkt
	//final - Variable nach init
	private static final Pattern vegetables = Pattern.compile("Zucchini|Paprikas?|Zwiebeln?|Tomaten?|Melanzani");
	
	public static void insertCheeseAroundVegetables(List<String> ingredients) {
		// Initialisierung Laufvariable (iterator)
		//Abbruchbedingung (hasNext())
		//keine Inkrementierung -> passiert im Schleifenkörper
		for(ListIterator<String> iterator = ingredients.listIterator(); iterator.hasNext();) {
			String ingredient = iterator.next();
		
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("Käse");
			}
		}
	}
	
	

	public static void main(String[] args) {
	
		List<String> ingredients = new LinkedList<String>();
		Collections.addAll(ingredients, "Gnocchi", "Paprika","Tomate","Pfeffer");
		insertCheeseAroundVegetables(ingredients);
		System.out.println(ingredients);
		
	}

}
