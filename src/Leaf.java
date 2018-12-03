import java.util.ArrayList;

public class Leaf extends Node {
	
	ArrayList<String> objects;
	
	public Leaf () {
		
	}
	
	@Override
	public Leaf findLeafOf(String s){
		if (objects.contains(s)) {
			return this;
		}
		return null;
	}
	
	@Override
	public String getRandomObject(){
		return objects.get(Randomization.RandomInt(0, objects.size()));
	}
	
}
