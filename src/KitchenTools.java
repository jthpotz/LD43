import java.util.ArrayList;
import java.util.Collections;

public class KitchenTools extends Leaf{

	public KitchenTools() {
		name = "KitchenTools";
		objects = new ArrayList<String>();
		Collections.addAll(objects, new String[]{
				"Knife",
				"Grater",
				"Ladle",
				"Whisk",
				"Spatula",
				"Measuring Cup",
				"Cutting Board",
				"Can Opener"
		});
	}
	
	public String toString(){
		return "KitchenTools";
	}
	
}
