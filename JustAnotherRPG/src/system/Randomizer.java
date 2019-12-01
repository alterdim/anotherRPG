package system;

import java.util.Random;

public class Randomizer {
		private static Random random = new Random();
	public static String randomString(String[] list) {
		int elementPicker = random.nextInt(list.length);
		return list[elementPicker];
	}
	public static int randomInt(int i) {
		return random.nextInt(i);
	}
	
	public static float randomFloat() {
		return random.nextFloat();
	}
	
	

}
