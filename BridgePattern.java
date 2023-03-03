package Ex5;

class Bridge {
	public static void main(String[] args) {
		Computer computer1 = new Laptop(new Build(), new Assemble());
		computer1.manufacture();
		Computer computer2 = new Tablet(new Build(), new Assemble());
		computer2.manufacture();
	}
}

abstract class Computer {
	protected Workshop workShop1;
	protected Workshop workShop2;

	protected Computer(Workshop workShop1, Workshop workShop2) {
		this.workShop1 = workShop1;
		this.workShop2 = workShop2;
	}

	abstract public void manufacture();
}

class Laptop extends Computer {
	public Laptop(Workshop workShop1, Workshop workShop2) {
		super(workShop1, workShop2);
	}

	@Override
	public void manufacture() {
		System.out.println("Laptop Manufacture");
		workShop1.work();
		workShop2.work();
	}
}

class Tablet extends Computer {
	public Tablet(Workshop workShop1, Workshop workShop2) {
		super(workShop1, workShop2);
	}

	@Override
	public void manufacture() {
		System.out.println("Tablet Manufacture");
		workShop1.work();
		workShop2.work();
	}
}

interface Workshop {
	abstract public void work();
}

class Build implements Workshop {
	@Override
	public void work() {
		System.out.println("Builded");
	}
}

class Assemble implements Workshop {
	@Override
	public void work() {
		System.out.println("Assembled");
	}
}
