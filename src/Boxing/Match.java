package Boxing;

public class Match {
	Fighter f1;
	Fighter f2;
	int minweight;
	int maxweight;
	double random;

	Match(Fighter f1, Fighter f2, int minweight, int maxweight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minweight = minweight;
		this.maxweight = maxweight;
	}

	boolean randomStart() {
		random = Math.random();
		if (random >= 0.5) {
			return true;
		} else {
			return false;
		}
	}

	void run() {
		if (randomStart()) {
			System.out.println(f1.name+ " ilk vuruşu yapma hakkını kazandı.");
			if (isCheck()) {
				while (this.f1.health > 0 && this.f2.health > 0) {
					System.out.println("\n======YENİ ROUND======\n");
					this.f2.health = f1.hit(f2);
					if (isWin()) {
						break;
					}
					this.f1.health = f2.hit(f1);
					if (isWin()) {
						break;
					}
					System.out.println("\n" + this.f1.name + " kalan sağlık " + this.f1.health);
					System.out.println(this.f2.name + " kalan sağlık " + this.f2.health);
				}
			}
		} else {
			System.out.println(f2.name+ " ilk vuruşu yapma hakkını kazandı.");
			if (isCheck()) {
				while (this.f1.health > 0 && this.f2.health > 0) {
					System.out.println("\n======YENİ ROUND======\n");
					this.f1.health = f2.hit(f1);
					if (isWin()) {
						break;
					}
					this.f2.health = f1.hit(f2);
					if (isWin()) {
						break;
					}
					System.out.println("\n" + this.f1.name + " kalan sağlık " + this.f1.health);
					System.out.println(this.f2.name + " kalan sağlık " + this.f2.health);
				}
			}

		}
	}

	boolean isCheck() {
		if ((this.f1.weight >= this.minweight && this.f1.weight <= this.maxweight)
				&& (this.f2.weight >= this.minweight && this.f2.weight <= this.maxweight)) {
			return true;
		} else {
			System.out.println("Dövüşcülerin sikletleri uyuşmuyor.");
			return false;
		}
	}

	boolean isWin() {
		if (f1.health == 0) {
			System.out.println(f2.name + " kazandı");
			return true;
		}
		if (f2.health == 0) {
			System.out.println(f1.name + " kazandı");
			return true;
		}
		return false;
	}

}
