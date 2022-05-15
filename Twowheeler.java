package week1.day1.assignments;

public class Twowheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 789456123l;
	boolean isPunctured = false;
	String bikeName = "Enfield";
	double runningKM = 76343.5;
	
	public static void main(String[] args) {
		System.out.println("Executing the Main method");
		Twowheeler bike = new Twowheeler();
		System.out.println(bike.noOfWheels);
		System.out.println(bike.noOfMirrors);
		System.out.println(bike.chassisNumber);
		System.out.println(bike.isPunctured);
		System.out.println(bike.bikeName);
		System.out.println(bike.runningKM);

	}

}
