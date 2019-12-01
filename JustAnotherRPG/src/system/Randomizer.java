package system;

import java.util.Random;

public class Randomizer {
		private static Random random = new Random();
	public static String randomString(String[] list) {
		int elementPicker = random.nextInt(list.length);
		return list[elementPicker];
	}
	public static int randomInt(int x, int y) {
		return random.nextInt(y) + x;
	}
	
	public static double randomFloat(int x, int y) {
		return (random.nextInt(y) + x )/10d;
	}
	
	public static double randomFloat() {
		return random.nextFloat();
	}
	

}
