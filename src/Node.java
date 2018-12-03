import java.util.ArrayList;

public class Node {

	static final Node root = new Node("Object");
	
	static final String[] types = new String[]{
		"Object",
		"LivingThings",
		"InanimateObjects",
		"Animals",
		"Plants",
		"Mammals",
		"Birds",
		"Reptiles",
		"Fish",
		"Trees",
		"Foods",
		"Fruits",
		"Vegetables",
		"Cooked"
	};
	
	String name;
	
	ArrayList<Node> subNodes = new ArrayList<Node>();
	
	Node parent = null;
	
	public Node() {
		
	}
	
	public Node (String name) {
		this.name = name;
		Node n;
		switch(name) {
		case "Object":
			addNode("LivingThings");
			addNode("InanimateObjects");
			break;
		case "InanimateObjects":
			addNode("Foods");
			addNode("Tools");
			n = new Furniture();
			n.AddParent(this);
			subNodes.add(n);
			n = new Clothing();
			n.AddParent(this);
			subNodes.add(n);
			break;
		case "Tools":
			n = new WorkTools();
			n.AddParent(this);
			subNodes.add(n);
			n = new KitchenTools();
			n.AddParent(this);
			subNodes.add(n);
		case "LivingThings":
			addNode("Animals");
			addNode("Plants");
			break;
		case "Foods":
			n = new Fruits();
			n.AddParent(this);
			subNodes.add(n);
			n = new Vegetables();
			n.AddParent(this);
			subNodes.add(n);
			n = new Cooked();
			n.AddParent(this);
			subNodes.add(n);
			break;
		case "Animals":
			n = new Mammals();
			n.AddParent(this);
			subNodes.add(n);
			n = new Birds();
			n.AddParent(this);
			subNodes.add(n);
			n = new Reptiles();
			n.AddParent(this);
			subNodes.add(n);
			n = new Fish();
			n.AddParent(this);
			subNodes.add(n);
			break;
		case "Plants":
			n = new Trees();
			n.AddParent(this);
			subNodes.add(n);
			break;
		}
	}
	
	public void AddParent(Node n) {
		this.parent = n;
	}

	
	private void addNode(String s) {
		Node n = new Node(s);
		n.AddParent(this);
		subNodes.add(n);
	}
	
	public String getDescription(String object){
		String s = "";
		Leaf l = this.findLeafOf(object);
		if (l == null) {
			return "This is not a valid object.";
		}
		Node n = l;
		while(n != null) {
			s = n.toString() + " " + s;
			n = n.parent;
		}
		return s;
	}
	
	public Leaf findLeafOf(String object){
		Leaf l;
		for(Node n : subNodes){
			l = n.findLeafOf(object);
			if (l != null) {
				return l;
			}
		}
		return null;
	}
	
	public String toString(){
		return name;
	}
	
	public boolean checkParent(String object, String parent) {
		Leaf l = findLeafOf(object);
		Node n = l;
		while(n != null) {
			if (n.name.equalsIgnoreCase(parent)) {
				return true;
			}
			n = n.parent;
		}
		return false;
	}
	
	public String getRandomObject(){
		return subNodes.get(Randomization.RandomInt(0, subNodes.size())).getRandomObject();
	}
	
}
