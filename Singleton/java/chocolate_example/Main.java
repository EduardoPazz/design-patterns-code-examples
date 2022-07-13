package chocolate_example;

class Main {
	public static void main(String[] args) {
		System.out.println("Hardcoded example \n");
		var cb1 = ChocolateBoiler.getInstance();
		var cb2 = ChocolateBoiler.getInstance();

		System.out.println("First object address: " + cb1);
		System.out.println("Second object address: " + cb2);
		System.out.println("Are they equal? " + (cb1 == cb2));

		System.out.println("Enum example \n");
		var cbe1 = ChocolateBoilerEnum.INSTANCE;
		var cbe2 = ChocolateBoilerEnum.INSTANCE;
		cbe1.boil();
		cbe2.fill();
		System.out.println("First object address: " + cbe1);
		System.out.println("Second object address: " + cbe2);
		System.out.println("Are they equal? " + (cbe1 == cbe2));
	}
}
