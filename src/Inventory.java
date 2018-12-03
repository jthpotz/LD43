import java.util.ArrayList;

public class Inventory {

	public static final Inventory inventory = new Inventory();
	
	int maxCount = 3;
	ArrayList<String> objects = new ArrayList<String>();
	
	public Inventory () {
		while (objects.size() < maxCount) {
			objects.add(Node.root.getRandomObject());
		}
	}
	
	public String toString() {
		String s = "";
		for (int i = 1; i <= maxCount; i++) {
			s += i + ". " + objects.get(i-1) + "\n";
		}
		return s;
	}
	
	public void IncreaseCount() {
		maxCount++;
		objects.add(Node.root.getRandomObject());
	}
	
	
}
