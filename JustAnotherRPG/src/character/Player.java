package character;

import item.Gear;

public class Player extends Character {
	
	int gold = 0;
	Gear headGear = null;
	Gear torsoGear = null;
	Gear leggingsGear = null;
	Gear bootsGear = null;
	int skillPoints = 0;
	
	Player(String name, int hp, int mp, int atk, int def, int sag) {
		super(name, hp, mp, atk, def, sag);
	}
	
	public void levelUp() {
		
	}
	
	

}
