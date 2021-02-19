package VehicleChallenge;

public class Boat extends Vehicle{
	public Boat(String vehicleType, int vehicleiD, String vehicleMake, String vehicleColour, int yearMade) {
		super( vehicleType,vehicleiD, vehicleMake, vehicleColour, yearMade);
	}
	@Override
	public String makeNoise() {
		return "Honk!";
	}
}
