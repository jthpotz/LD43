import java.util.ArrayList;
import java.util.Collections;

public class WorkTools extends Leaf{

	public WorkTools() {
		name = "WorkTools";
		objects = new ArrayList<String>();
		Collections.addAll(objects, new String[]{
				"Hammer",
				"Mallet",
				"ScrewDriver",
				"Wrench",
				"Vise",
				"Level",
				"Saw",
				"Drill"
		});
	}
	
	public String toString(){
		return "WorkTools";
	}
	
}
