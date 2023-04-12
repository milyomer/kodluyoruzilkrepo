package Boxing;

public class Fighter {
	String name;
	int damage;
	int health;
	int weight;
	int dodge;

	Fighter(String name, int damage, int health, int weight, int dodge) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		if (dodge < 0 && dodge > 100) {
			this.dodge = 0;
		} else {
			this.dodge = dodge;
		}
	}

	int hit(Fighter foe) {
		if (isDodge()) {
			System.out.println(foe.name + " saldırıyı blokladı.");
			return foe.health;
		} else {
			System.out.println(this.name + ", " + foe.name + " e vurdu. " + this.damage + " hasar verdi.");
			if (foe.health - this.damage < 0) {
				return 0;
			}
			return foe.health - this.damage;
		}
	}

	boolean isDodge() {
		double randomDodge = Math.random() * 100;
		return randomDodge <= this.dodge;
	}
}
