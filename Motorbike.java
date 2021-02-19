package VehicleChallenge;

public class Motorbike extends Vehicle{
	public Motorbike(String vehicleType, int vehicleiD, String vehicleMake, String vehicleColour, int yearMade) {
		super(vehicleType, vehicleiD, vehicleMake, vehicleColour, yearMade);
	}
	
	@Override
	public String makeNoise() {
		return "Whoosh!";
	}
}
