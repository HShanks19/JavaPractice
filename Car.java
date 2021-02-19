package VehicleChallenge;

public class Car extends Vehicle {
	public Car(String vehicleType, int vehicleiD, String vehicleMake, String vehicleColour, int yearMade, int numberOfSeats) {
		super(vehicleType, vehicleiD, vehicleMake, vehicleColour, yearMade);
		this.setnumberOfSeats(numberOfSeats);
	}
	@Override
	public String makeNoise() {
		return "Beeeeep!";
	}
	
	private int numberOfSeats;

	public int getnumberOfSeats() {
		return numberOfSeats;
	}

	public void setnumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	@Override
	public void print() {
		System.out.println("Vehicle Profile: Vehicle iD:" + this.getVehicleiD() + " Vehicle Make: " + this.getVehicleMake() + " Vehicle Colour: " + this.getVehicleColour() + " Year Made: " + this.getyearMade() + " Number of Seats: " + this.getnumberOfSeats() + ". " + this.makeNoise() );
	}
}
