package VehicleChallenge;

public abstract class Vehicle {
	
	private int vehicleiD;
	
	private String vehicleMake;
	
	private String vehicleColour;
	
	private int yearMade;
	
	private String vehicleType;
	
	public Vehicle(String vehicleType, int vehicleiD, String vehicleMake, String vehicleColour, int yearMade) {
		this.vehicleType = vehicleType;
		this.vehicleiD = vehicleiD;
		this.vehicleMake = vehicleMake;
		this.vehicleColour = vehicleColour;
		this.yearMade = yearMade;
	}
	public void print() {
		System.out.println("Vehicle Profile:" + " Vehicle iD:" + this.getVehicleiD() + " Vehicle Make: " + this.getVehicleMake() + " Vehicle Colour: " + this.getVehicleColour() + " Year Made: " + this.getyearMade() + " " + this.makeNoise() );
	}
	public abstract String makeNoise();

	 public String getvehicleType(){
	        return vehicleType;
	}
	 public void setvehicleType(String newvehicleType){
	        this.vehicleMake = newvehicleType;
	}
	public int getVehicleiD(){
        return vehicleiD;
    }

    public void setVehicleiD(int newVehicleiD){
        this.vehicleiD = newVehicleiD;
    }
    
    public String getVehicleMake(){
        return vehicleMake;
    }

    public void setVehicleMake(String newVehicleMake){
        this.vehicleMake = newVehicleMake;
    }
    public String getVehicleColour(){
        return vehicleColour;
    }

    public void setVehicleColour(String newVehicleColour){
        this.vehicleColour = newVehicleColour;
    }
    public int getyearMade(){
        return yearMade;
    }

    public void setyearMade(int newYearMade){
        this.yearMade = newYearMade;
    }
    
	
}
