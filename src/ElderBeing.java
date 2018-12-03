import java.util.ArrayList;
import java.util.Arrays;

public class ElderBeing {

	Attribute[] attributes;
	
	String name;
	
	public static ArrayList<String> names = new ArrayList<>(Arrays.asList(
			"Alphus",
			"Bravious",
			"Charnegus",
			"Deltan",
			"Echosium",
			"Foxtran",
			"Golnatious",
			"Hotelia",
			"Indiagos",
			"Juliettsia",
			"Kiloso",
			"Limago",
			"Mikios",
			"Novebran",
			"Oscaran",
			"Papasia",
			"Quebesium",
			"Romeoso",
			"Sierran",
			"Tangosio",
			"Victran",
			"Uniformious",
			"Whiskago",
			"Xran",
			"Yankesia",
			"Zulos"
			));
	
	public ElderBeing(String name) {
		this.name = name;
		attributes = new Attribute[Randomization.RandomInt(3, 6)];
		for (int i = 0; i < attributes.length; i++) {
			attributes[i] = new Attribute(Randomization.RandomInt(0, Attribute.number));
		}
	}
	
	public String getDescription() {
		return "Among " + attributes.length + " qualities, " + name + " cares about:\n" +  attributes[Randomization.RandomInt(0, attributes.length)].description;
	}
	
	public int checkObject(String object) {
		int score = 0;
		for (Attribute a : attributes) {
			score += a.checkObject(object);
		}
		if (Math.abs(score) <= 1) {
			score = 0;
		}
		if (score > 0) {
			return Randomization.RandomInt(20, 5*score + 15) * Pantheon.pantheon.multiplier;
		} else if (score == 0) {
			return Randomization.RandomNegative() * Randomization.RandomInt(1, 10) * Pantheon.pantheon.multiplier;
		} else if (score < 0) {
			return -1*Randomization.RandomInt(20, 5*Math.abs(score) + 15) * Pantheon.pantheon.multiplier;
		}
		return 0;
	}
	
//	private boolean checkAttributesDifferent() {
//		ArrayList<Integer> types = new ArrayList<Integer>();
//		for (Attribute a : attributes) {
//			if (a != null) {
//				if (types.contains(a.type)) {
//					return false;
//				}
//				types.add(a.type);
//			}
//		}
//		return true;
//	}
	
}
