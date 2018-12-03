import java.util.Random;

public class Randomization {

	private static Random r = new Random();
	
	//min inclusive, max exclusive
	public static int RandomInt(int min, int max) {
		return r.nextInt(max) + min;
	}
	
	public static int RandomNegative(){
		if (r.nextBoolean()) {
			return 1;
		}
		return -1;
	}
	
}
