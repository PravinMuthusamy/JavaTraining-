package Ex4;

import java.util.Scanner;

public class VisitorPattern {
	public static void main(String[] args) {
		People people = new People();
		City chennai = new City();
		String Case;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Discrepancy...");
		Case = scan.nextLine();
		people.residing(chennai, Case);
	}
}

class People {
	public void residing(City city, String Case) {
		try {
			city.Cases(Case);
		} catch (CityException e) {
                        e.policeVisit();
			e.printStackTrace();
		}
	}

}

class City {
	public void Cases(String Case) throws CityException {
		if (Case.equals("Valuable things are missing")) {
			throw new TheftException("Theft");
		} else if (Case.equals("Someone is missing")) {
			throw new KidnapException("Kidnap");
		}

		else if (Case.equals("Found deadbody")) {
			throw new MurderException("Murder");
		}
	}
}

abstract class CityException extends Exception {
	public abstract void policeVisit();
}

class TheftException extends CityException {
	String CaseInfo;

	public TheftException(String CaseInfo) {
		this.CaseInfo = CaseInfo;
	}

	public String toString() {
		return CaseInfo;
	}

	public void policeVisit() {
		PoliceStation policeStation = new Police();
		policeStation.investigate(this);
	}

}

class KidnapException extends CityException {
	String CaseInfo;

	public KidnapException(String CaseInfo) {
		this.CaseInfo = CaseInfo;
	}

	public String toString() {
		return CaseInfo;
	}

	public void policeVisit() {
		PoliceStation policeStation = new Police();
		policeStation.investigate(this);
	}

}

class MurderException extends CityException {
	String CaseInfo;

	public MurderException(String CaseInfo) {
		this.CaseInfo = CaseInfo;
	}

	public String toString() {

		return CaseInfo;
	}

	public void policeVisit() {
		PoliceStation policeStation = new Police();
		policeStation.investigate(this);
	}
}

abstract class PoliceStation {
	abstract public void investigate(TheftException theftException);

	abstract public void investigate(KidnapException kidnapException);

	abstract public void investigate(MurderException muderException);
}

class Police extends PoliceStation {

	public void investigate(TheftException theftException) {
		System.out.println("Find the Thief...!");
	}

	public void investigate(KidnapException kidnapException) {
		System.out.println("Find the Kidnapper...!");
	}

	public void investigate(MurderException MurderException) {
		System.out.println("Catch the Muderer...And Punish him");
	}

}