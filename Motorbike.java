package VehicleChallenge;

public class Motorbike extends Vehicle{
	public Motorbike(String vehicleType, int vehicleiD, String vehicleMake, String vehicleColour, int yearMade, double motorbikeTax) {
		super(vehicleType, vehicleiD, vehicleMake, vehicleColour, yearMade);
		this.setmotorbikeTax(motorbikeTax);
	}
	private double motorbikeTax;

	public double getmotorbikeTax() {
		return motorbikeTax;
	}
	@Override
	public double fixBill() {
		double x = 2 * this.motorbikeTax;
		return x;
	}
	public void setmotorbikeTax(double motorbikeTax) {
		this.motorbikeTax = motorbikeTax;
	}
	@Override
	public String makeNoise() {
		return "Whoosh!";
	}
	@Override
	public void print() {
		System.out.println("Vehicle Profile: Vehicle iD:" + this.getVehicleiD() + " Vehicle Make: " + this.getVehicleMake() + " Vehicle Colour: " + this.getVehicleColour() + " Year Made: " + this.getyearMade() + " Motorbike Tax: " + this.getmotorbikeTax() + ". " + this.makeNoise() );
	}
}
