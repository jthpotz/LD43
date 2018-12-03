import java.util.ArrayList;
import java.util.Collections;

public class Reptiles extends Leaf {

	public Reptiles() {
		name = "Reptiles";
		objects = new ArrayList<String>();
		Collections.addAll(objects, new String[]{
				"King Cobra",
				"Iguana",
				"Turtle",
				"Crocodile",
				"Gecko",
				"Boa Constrictor",
				"Tortise",
				"Ball Python"
		});
	}
	
	public String toString(){
		return "Reptiles";
	}
	
}
