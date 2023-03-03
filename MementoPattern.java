package Ex5;

import java.util.ArrayList;
import java.util.List;

public class MementoPattern {
	public static void main(String[] args) {
		Water water = new Water();
		water.setState("Liquid State");
		System.out.println("State changed to " + water.getState());
		System.out.println("Freeze to make it as a Ice");
		water.setState("Solid State");
		System.out.println("State changed to " + water.getState());
		System.out.println("Heat it till it vapourizes");
		water.setState("Gas");
		System.out.println("State changed to " + water.getState());
		System.out.println("Condensation");
		System.out.println("REVERSING THE STATE");
		water.getStateFromMemento(2);
		System.out.println("State changed to " + water.getState());
		water.getStateFromMemento(1);
		System.out.println("State changed to " + water.getState());
		water.getStateFromMemento(0);
		System.out.println("State changed to " + water.getState());

	}
}

class Water {
	String state;
	SaveState saveState = new SaveState();

	public void setState(String state) {
		this.state = state;
		saveState.add(state);
	}

	public String getState() {
		return state;
	}

	public void getStateFromMemento(int index) {
		state = saveState.get(index);
	}
}

class SaveState {
	private List<String> mementoList = new ArrayList<>();

	public void add(String state) {
		mementoList.add(state);
	}

	public String get(int index) {
		return mementoList.get(index);
	}
}
