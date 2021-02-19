package VehicleChallenge;

public class Boat extends Vehicle{
	public Boat(String vehicleType, int vehicleiD, String vehicleMake, String vehicleColour, int yearMade, double boatTax) {
		super( vehicleType,vehicleiD, vehicleMake, vehicleColour, yearMade);
		this.setboatTax(boatTax);
	}
	@Override
	public String makeNoise() {
		return "Honk!";
	}
	private double boatTax;

	public double boatTax() {
		return boatTax;
	}
	@Override
	public double fixBill() {
		double x = 12.5 * this.boatTax;
		return x;
	}
	public void setboatTax(double boatTax) {
		this.boatTax = boatTax;
	}
}
