package combat.attacks;

public abstract class Spell 
{
	public int mpCost = 0;
	public int hpCost = 0;
	boolean multiTarget = false;
	String scaling = "";
	public int multiplier = 1;
	float critChance = 0.0f;
	float lifeSteal = 0.0f;
	StatusEffect statusEffect = null;
	String gearRestriction = null;
	
	public Spell(int mpCost, int hpCost, boolean multiTarget, String scaling, int multiplier,
			float critChance, float lifeSteal, StatusEffect statusEffect, String gearRestriction) 
	{
		this.mpCost = mpCost;
		this.hpCost = hpCost;
		this.multiplier = multiplier;
		this.multiTarget = multiTarget;
		this.scaling = scaling;
		this.critChance = critChance;
		this.lifeSteal = lifeSteal;
		this.statusEffect = statusEffect;
		this.gearRestriction = gearRestriction;
	}
	
	
}
