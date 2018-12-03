import java.util.ArrayList;
import java.util.Collections;

public class Clothing extends Leaf{

	public Clothing() {
		name = "Clothing";
		objects = new ArrayList<String>();
		Collections.addAll(objects, new String[]{
				"Shirt",
				"Pants",
				"Skirt",
				"Hat",
				"Socks",
				"Shoes",
				"Jacket",
				"Gloves"
		});
	}
	
	public String toString(){
		return "Clothing";
	}
	
}
