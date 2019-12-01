package item;

import system.ConsoleColors;

public abstract class Item {
	String name = "defaultItemName";
	int price = -1;
	Rarity rarity = Rarity.baseRarity;
	String description = "default Description";
	Item(String name, int price, Rarity rarity, String description) {
		this.price = price;
		this.rarity = rarity;
		this.name = rarity.color + name + ConsoleColors.RESET;
		this.description = description;
	}

}
