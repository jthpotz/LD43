import java.util.ArrayList;
import java.util.Collections;

public class Furniture extends Leaf{

	public Furniture() {
		name = "Furniture";
		objects = new ArrayList<String>();
		Collections.addAll(objects, new String[]{
				"Bed",
				"Couch",
				"Stool",
				"Chair",
				"Desk",
				"Cabinet",
				"Wardrobe",
				"Shelf"
		});
	}
	
	public String toString(){
		return "Furniture";
	}
	
}
