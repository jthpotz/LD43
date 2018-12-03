import java.util.ArrayList;
import java.util.Collections;

public class Trees extends Leaf{

	public Trees() {
		name = "Trees";
		objects = new ArrayList<String>();
		Collections.addAll(objects, new String[]{
				"Oak",
				"Birch",
				"Juniper",
				"Maple",
				"Pine",
				"Spruce",
				"Sycamore",
				"Willow"
		});
	}
	
	public String toString(){
		return "Trees";
	}
	
}
