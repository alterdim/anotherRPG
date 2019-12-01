package combat.attacks;

public abstract class Spell 
{
	public int mpCost = 0;
	public int hpCost = 0;
	public boolean multiTarget = false;
	public String scaling = "";
	public int multiplier = 1;
	public float critChance = 0.0f;
	public float lifeSteal = 0.0f;
	public StatusEffect statusEffect = null;
	public float statusChance = 0.1f;
	public boolean armorPen = false;
	
	public Spell(int mpCost, int hpCost, boolean multiTarget, String scaling, int multiplier,
			float critChance, float lifeSteal, StatusEffect statusEffect, float statusChance, boolean armorPen)
	{
		this.mpCost = mpCost;
		this.hpCost = hpCost;
		this.multiplier = multiplier;
		this.multiTarget = multiTarget;
		this.scaling = scaling;
		this.critChance = critChance;
		this.lifeSteal = lifeSteal;
		this.statusEffect = statusEffect;
		this.statusChance = statusChance;
		this.armorPen = armorPen;
	}
	
	
}
