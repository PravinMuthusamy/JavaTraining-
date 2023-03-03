package Ex4;

import java.util.Scanner;

public class FactoryPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter which type of shoe you need:");
		String shoeType = scan.next();
		ShoeFactory factory = new ShoeFactory(shoeType);
		Shoe shoe = factory.makeShoe();
		shoe.shoeModel();
	}
}

class ShoeFactory {
	String shoe;

	public ShoeFactory(String shoe) {
		this.shoe = shoe;
	}

	public Shoe makeShoe() {
		if (shoe.equals("Sports")) {
			return new SportsShoe();
		} else if (shoe.equals("Formal")) {
			return new FormalShoe();
		} else if (shoe.equals("Casual")) {
			return new CasualShoe();
		} else {
			return null;
		}

	}
}

abstract class Shoe {
	abstract void shoeModel();
}

class SportsShoe extends Shoe {
	void shoeModel() {
		System.out.println("Sports Shoe");
		System.out.println(this);
	}
}

class FormalShoe extends Shoe {
	@Override
	void shoeModel() {
		System.out.println("Formal Shoe");
		System.out.println(this);
	}
}

class CasualShoe extends Shoe {
	@Override
	void shoeModel() {
		System.out.println("Casual shoe");
		System.out.println(this);
	}

}
