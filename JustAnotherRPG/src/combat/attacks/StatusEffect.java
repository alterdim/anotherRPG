package combat.attacks;

public class StatusEffect {
	
	int duration;
	String affectedStat;
	float strength;
	String description;
	String name;
	
	public StatusEffect(int duration, String affectedStat, float strength, String name, String description) {
		this.duration = duration;
		this.affectedStat = affectedStat;
		this.strength = strength;
		this.name = name;
		this.description = description;
	}

}
