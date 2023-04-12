package Boxing;

public class Main {

	public static void main(String[] args) {
		Fighter f1 = new Fighter("Muhammed Ali", 10, 120, 100, 25);
		Fighter f2 = new Fighter("Rocky", 20, 85, 75, 35);
		Match match = new Match(f1, f2, 70, 100);
		match.run();
	}
}
