package character;

import item.Gear;

public class Player extends Character {
	
	int gold = 0;
	Gear headGear = null;
	Gear torsoGear = null;
	Gear leggingsGear = null;
	Gear bootsGear = null;
	int skillPoints = 0;
	int level = 1;
	int experience = 0;
	int nextLevelXP = 1;
	
	Player(String name, int hp, int mp, int atk, int def, int sag, int spd) {
		super(name, hp, mp, atk, def, sag, spd);
	}
	
	public void levelUp() {
		while (experience >= nextLevelXP) {
			nextLevelXP = (int)((4 * (level ^ 3)) / 5);
			skillPoints += 3;
		}
		
	}
	
	

}
