import java.util.ArrayList;
import java.util.Collections;

public class Mammals extends Leaf {
	
	public Mammals() {
		name = "Mammals";
		objects = new ArrayList<String>();
		Collections.addAll(objects, new String[]{
				"Otter",
				"Dog",
				"Cat",
				"Elephant",
				"Mouse",
				"Lion",
				"Bison",
				"Rat"
		});
	}
	
	public String toString(){
		return "Mammals";
	}
	
}
