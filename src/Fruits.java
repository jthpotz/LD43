import java.util.ArrayList;
import java.util.Collections;

public class Fruits extends Leaf{

	public Fruits() {
		name = "Fruits";
		objects = new ArrayList<String>();
		Collections.addAll(objects, new String[]{
				"Blueberry",
				"Peach",
				"Avacado",
				"Apple",
				"Pear",
				"Blackberry",
				"Pineapple",
				"Guava"
		});
	}
	
	public String toString(){
		return "Fruits";
	}
	
}
