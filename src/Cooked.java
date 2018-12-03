import java.util.ArrayList;
import java.util.Collections;

public class Cooked extends Leaf{

	public Cooked() {
		name = "Cooked";
		objects = new ArrayList<String>();
		Collections.addAll(objects, new String[]{
				"Bread",
				"Pie",
				"Porridge",
				"Jerkey",
				"Stew",
				"Soup",
				"Sandwich",
				"Stirfry"
		});
	}
	
	public String toString(){
		return "Cooked";
	}
	
}
