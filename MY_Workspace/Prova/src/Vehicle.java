public abstract class Vehicle {
	protected int wheels;
	protected String running;

	public abstract String run();

}

class Car extends Vehicle {
	public Car() {
		super();
		this.running = "velocit� max 300km/h";
		this.wheels = 4;
	}

	@Override
	public String run() {
		String result = this.running + this.wheels;
		return result;
	}


}
class Moto extends Vehicle {

	public Moto() {
		super();
		this.running = "velocit� max 200km/h";
		this.wheels = 2;
	}

	public String run() {

		String result = this.running + this.wheels;
		return result;
	}

	public static void main(String[] args) {
		Car one = new Car();
		Moto two = new Moto();
		System.out.println("Macchina :" + one.run());
		System.out.println("Moto :" + two.run());

	}
}
