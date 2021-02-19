package VehicleChallenge;

public class Motorbike extends Vehicle{
	public Motorbike(String vehicleType, int vehicleiD, String vehicleMake, String vehicleColour, int yearMade, int motorbikeTax) {
		super(vehicleType, vehicleiD, vehicleMake, vehicleColour, yearMade);
		this.setmotorbikeTax(motorbikeTax);
	}
	private int motorbikeTax;

	public int getmotorbikeTax() {
		return motorbikeTax;
	}
	@Override
	public double fixBill() {
		int x = 2 * this.motorbikeTax;
		return x;
	}
	public void setmotorbikeTax(int motorbikeTax) {
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
