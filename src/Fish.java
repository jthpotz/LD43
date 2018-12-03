import java.util.ArrayList;
import java.util.Collections;

public class Fish extends Leaf{

	public Fish() {
		name = "Fish";
		objects = new ArrayList<String>();
		Collections.addAll(objects, new String[]{
				"Salmon",
				"Bluefin Tuna",
				"Rainbow Trout",
				"Minnow",
				"Goldfins",
				"Carp",
				"Catfish",
				"Mackerel"
		});
	}
	
	public String toString(){
		return "Fish";
	}
	
}
