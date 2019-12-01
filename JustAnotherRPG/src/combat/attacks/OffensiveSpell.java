package combat.attacks;

public class OffensiveSpell extends Spell {

	public OffensiveSpell(int mpCost, int hpCost, boolean multiTarget, String scaling, int multiplier, float critChance,
			float lifeSteal, StatusEffect statusEffect, String gearRestriction) {
		super(mpCost, hpCost, multiTarget, scaling, multiplier, critChance, lifeSteal, statusEffect, gearRestriction);
	}
}
