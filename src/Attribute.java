
public class Attribute {
	
	static final char[] letters = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	static final int number = 5;
	
	int type = -1;
	
	int numLetters = -1;
	
	String description = "";
	
	String objectClass = "";
	
	char[] likedChars;
	
	char[] dislikedChars;
	
	public Attribute(int type){
		this.type = type;
		switch(type){
		case 0:
			description = "Seemingly nothing...";
			break;
		case 1:
			numLetters = Randomization.RandomInt(4, 9);
			description = "Number of letters, aproximately " + numLetters;
			break;
		case 2:
			objectClass = Node.types[Randomization.RandomInt(0, Node.types.length)];
			description = objectClass + " type objects ";
			break;
		case 3:
			description = "Likes characters such as: ";
			likedChars = new char[Randomization.RandomInt(3, 5)];
			for (char c : likedChars) {
				c = Attribute.letters[(Randomization.RandomInt(0, Attribute.letters.length))];
				description += c + ", ";
			}
			description = description.substring(0, description.length()-2);
			 break;
		case 4:
			description = "Dislikes characters such as: ";
			dislikedChars = new char[Randomization.RandomInt(3, 5)];
			for (char c : dislikedChars) {
				c = Attribute.letters[(Randomization.RandomInt(0, Attribute.letters.length))];
				description += c + ", ";
			}
			description = description.substring(0, description.length()-2);
			break;
		}
	}
	
	public int checkObject(String object) {
		switch(type) {
		case 1:
			return numLetters(object);
		case 2:
			return objectClass(object);
		case 3:
			return likedChars(object);
		case 4:
			return dislikedChars(object);
		default:
			return 0;
		}
	}
	
	private int numLetters(String object) {
		int close = Math.abs(numLetters - object.length());
		if (close <= 1) {
			return 1;
		} else if (close <= 3) {
			return 0;
		} else {
			return -1;
		}
	}
	
	private int objectClass(String object) {
		if (Node.root.checkParent(object, objectClass)) {
			return 1;
		}
		return -1;
	}
	
	private int likedChars(String object) {
		for (char c : likedChars) {
			if (object.indexOf(c, 0) != -1) {
				return 1;
			}
		}
		return -1;
	}
	
	private int dislikedChars(String object) {
		for (char c : dislikedChars) {
			if (object.indexOf(c, 0) != -1) {
				return -1;
			}
		}
		return 1;
	}
	
}
