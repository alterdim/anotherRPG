package item;

import java.util.HashMap;

import system.Randomizer;

public class Gear extends Item {
	
	public static String[] statList = {"hp", "mp", "atk", "def", "sag"};
	
	int level = 0;
	String gearType = null;
	HashMap<String, Integer> stats = new HashMap<String, Integer>();

	Gear(String name, int price, Rarity rarity, String description, String gearType, int hp, int mp, int atk, int def, int sag, int lck) {
		super(name, price, rarity, description);
		this.gearType = gearType;
		stats.put("hp", hp);
		stats.put("mp", mp);
		stats.put("atk", atk);
		stats.put("def", def);
		stats.put("sag", sag);
		stats.put("lck", lck);
	}
	
	public void upgrade() {
		this.level++;
		String editStat = Randomizer.randomString(statList);
		int oldStat = stats.get(editStat);
		stats.put(editStat, oldStat + Randomizer.randomInt(5));
	}

}
