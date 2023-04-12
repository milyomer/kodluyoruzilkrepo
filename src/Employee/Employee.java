package Employee;

public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYear;
	int taxCheck;
	int workYear;
	int addPrice;
	int bonus;

	Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	boolean tax() {
		if (this.salary >= 1000) {
			this.taxCheck = this.salary * 3 / 100;
			return true;
		}
		return false;
	}

	int raiseSalary() {

		workYear = 2021 - this.hireYear;
		if (workYear < 20) {
			if (workYear < 10) {
				this.addPrice = this.salary / 25;
			}
			this.addPrice = this.salary / 10;
		} else {
			this.addPrice = this.salary * 3 / 25;
		}
		return this.addPrice;
	}

	void totalPrice() {
		if (tax()) {
			System.out.println("Verginiz: " + taxCheck + "TL");
		}
		if (this.workHours > 40) {
			this.bonus = (this.workHours - 40) * 30;
			System.out.println("Ekstra Mesai ücretiniz: " + this.bonus + " TL");
		}
		System.out.println("Maaş artışı: " + raiseSalary() + " TL");
		System.out.println("Vergiler ve bonuslar ile birlikte maaşınız: "
				+ (this.salary - this.taxCheck + raiseSalary() + this.bonus) + "TL");
	}

	void printInfo() {
		System.out.println("====================");
		System.out.println("Adınız: " + this.name);
		System.out.println("Maaşınız: " + this.salary + "TL");
		System.out.println("Haftalık çalışma saatiniz: " + this.workHours);
		System.out.println("İşe başlangıç yılınız: " + this.hireYear);
		System.out.println();
		totalPrice();

	}

}
