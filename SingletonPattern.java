package Ex4;
public class SingletonPattern {
	public static void main(String[] args) {
		WashingMachine person1;
		person1 = WashingMachine.createInstance();
		person1.message="Person 1 is using";
		System.out.println(person1.message);

		WashingMachine person2;
		person2 = WashingMachine.createInstance();
		person2.message= "Person 2 is using";
		System.out.println(person2.message);
	}
}

class WashingMachine {
	static WashingMachine person;
	String message = "Message displayed";

	private WashingMachine() {
		System.out.println("Constructor Invoked");
	}

	static WashingMachine createInstance() {
		if (person == null) {
			person = new WashingMachine();
			return person;
		}
		return person;
	}

}