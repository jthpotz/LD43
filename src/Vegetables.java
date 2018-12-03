import java.util.ArrayList;
import java.util.Collections;

public class Vegetables extends Leaf{

	public Vegetables() {
		name = "Vegetables";
		objects = new ArrayList<String>();
		Collections.addAll(objects, new String[]{
				"Carrots",
				"Lettuce",
				"Broccoli",
				"Asparagus",
				"Beets",
				"Corn",
				"Onion",
				"Pepper"
		});
	}
	
	public String toString(){
		return "Vegetables";
	}
	
}
