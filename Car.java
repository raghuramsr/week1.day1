package week1.day1.assignments;

public class Car {

	public void applyBreak() {
		System.out.println("Applying break");
	}
	public void applyGear() {
		System.out.println("Applying Gear");
	}
	public void switchonAC() {
		System.out.println("Switching ON AC");
	}
	public void applyAccelerator() {
		System.out.println("Applying Accelerator");
	}
	
	public static void main(String[] args) {
		System.out.println("Executing Car class");
		Car ford = new Car();
		ford.switchonAC();
		ford.applyGear();
		ford.applyAccelerator();
		ford.applyBreak();

	}

}
