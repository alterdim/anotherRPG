package item;

import system.ConsoleColors;

public class Rarity {
	String name = "rarityName";
	String color = ConsoleColors.WHITE;
	
	public Rarity(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public static final Rarity baseRarity = new Rarity("baseRarity", ConsoleColors.RED_BOLD);
	public static final Rarity Common = new Rarity("Commun", ConsoleColors.WHITE);
	public static final Rarity Rare = new Rarity("Rare", ConsoleColors.CYAN);
	public static final Rarity Epic = new Rarity("Epique", ConsoleColors.PURPLE);
	public static final Rarity Legendary = new Rarity("Légendaire", ConsoleColors.GREEN);
	public static final Rarity Unique = new Rarity("Unique", ConsoleColors.RED);

}
