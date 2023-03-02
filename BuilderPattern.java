package Ex4;

public class BuilderPattern {
	public static void main(String[] args) {
		Car myCar = new Car.BuildCar().setCompany("Honda").setModel("Civic").setEngine("Petrol").setTire("MRF").build();
		System.out.println(myCar);
	}
}

class Car {
	class CarBuilder {
		String tire, engine, model, company;

		CarBuilder(String company, String model, String engine, String tire) {
			this.tire = tire;
			this.engine = engine;
			this.model = model;
			this.company = company;
		}

		public String toString() {
			return "CarBuilder[Company=" + company + ",Model=" + model + ",Engine=" + engine + ",Tire=" + tire + "]";
		}
	}

	CarBuilder carBuilder;

	public Car(BuildCar buildCar) {
		carBuilder = new CarBuilder(buildCar.company, buildCar.model, buildCar.engine, buildCar.tire);
	}

	public String toString() {
		return "Car[carBuilder=" + carBuilder + "]";
	}

	static class BuildCar {
		String company, model, engine, tire;

		public BuildCar setCompany(String company) {
			this.company = company;
			return this;
		}

		public BuildCar setModel(String model) {
			this.model = model;
			return this;
		}

		public BuildCar setEngine(String engine) {
			this.engine = engine;
			return this;
		}

		public BuildCar setTire(String tire) {
			this.tire = tire;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}
}