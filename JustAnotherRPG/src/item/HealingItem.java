package item;

public abstract class HealingItem extends Item {
	
	boolean healsAllTeam = false;
	int healingValue = 0;

	HealingItem(String name, int price, Rarity rarity, String description, int healingValue, boolean healsAllTeam) {
		super(name, price, rarity, description);
		this.healingValue = healingValue;
		this.healsAllTeam = healsAllTeam;
	}

}
