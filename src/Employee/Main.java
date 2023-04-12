package Employee;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee("Kanuni Sultan", 800, 45, 1988);
		Employee e2 = new Employee("Sultan Bayezid", 600, 35, 1994);
		Employee e3 = new Employee("Fatih Sultan Mehmet", 1300, 60, 1990);
		e1.printInfo();
		e2.printInfo();
		e3.printInfo();
	}
}
