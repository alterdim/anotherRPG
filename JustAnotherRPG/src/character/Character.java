package character;

import java.util.HashMap;

import combat.attacks.Spell;


public abstract class Character {
	HashMap<String, Integer> stats = new HashMap<String, Integer>();
	String name = "eric";
	
	
	Character(String name, int hp, int mp, int atk, int def, int sag) {
		stats.put("hp", hp);
		stats.put("mp", mp);
		stats.put("atk", atk);
		stats.put("def", def);
		stats.put("sag", sag);
		stats.put("lck", 0);
	}
	
	int currentHP = stats.get("hp");
	int currentMP = stats.get("mp");
	
	public void restoreAll() {
		this.restoreHP();
		this.restoreMP();
	}
	
	public void restoreHP() {
		this.currentHP = stats.get("hp");
	}
	
	public void restoreMP() {
		this.currentMP = stats.get("mp");
	}
	
	public int calculateDamage(Character target, Spell spell) {
		int result = spell.multiplier;
		return result;
		
	}

	
}
