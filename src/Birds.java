import java.util.ArrayList;
import java.util.Collections;

public class Birds extends Leaf {

	public Birds() {
		name = "Birds";
		objects = new ArrayList<String>();
		Collections.addAll(objects, new String[]{
				"Red Tailed Hawk",
				"Pidgeon",
				"Osprey",
				"Sparrow",
				"Finch",
				"Seagull",
				"Pelican",
				"Perigrine Falcon"
		});
	}
	
	public String toString(){
		return "Birds";
	}
	
}
