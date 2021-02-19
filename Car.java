package VehicleChallenge;

public class Car extends Vehicle {
	public Car(String vehicleType, int vehicleiD, String vehicleMake, String vehicleColour, int yearMade, int numberOfSeats, int carTax) {
		super(vehicleType, vehicleiD, vehicleMake, vehicleColour, yearMade);
		this.setnumberOfSeats(numberOfSeats);
		this.setcarTax(carTax);
	}
	@Override
	public String makeNoise() {
		return "Beeeeep!";
	}
	public int getcarTax() {
		return carTax;
	}
	@Override
	public double fixBill() {
		int x = 4 * this.carTax;
		return x;
	}
	public void setcarTax(int carTax) {
		this.carTax = carTax;
	}
	
	private int numberOfSeats;
	
	private int carTax;

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
