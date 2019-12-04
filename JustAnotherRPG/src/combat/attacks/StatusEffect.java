package combat.attacks;

public class StatusEffect {
	
	public int duration;
	public String affectedStat;
	public float strength;
	public String description;
	public String name;
	
	public StatusEffect(int duration, String affectedStat, float strength, String name, String description) {
		this.duration = duration;
		this.affectedStat = affectedStat;
		this.strength = strength;
		this.name = name;
		this.description = description;
	}
	
	public StatusEffect(StatusEffect effect) {
		this.duration = effect.duration;
		this.affectedStat = effect.affectedStat;
		this.strength = effect.strength;
		this.name = effect.name;
		this.description = effect.description;
	}
	

}
