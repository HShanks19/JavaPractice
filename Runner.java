package VehicleChallenge;

public class Runner {
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car car1 = new Car("car", 1, "Vauxhall", "Grey", 2014, 6);		
		Motorbike motorbike1 = new Motorbike("motorbike", 2, "Honda", "Red", 2019);
		Boat boat1 = new Boat("boat", 3, "AVA Yachts", "White", 2012);
		Boat boat2 = new Boat("boat", 4, "AVA Yachts", "Black", 2020);
		Car car2 = new Car("car", 5, "BMW", "Black", 2018, 7);	
		Motorbike motorbike2 = new Motorbike("motorbike", 6, "Honda", "Black", 2021);
		
		// adds Vehicles
		garage.addVehicle(boat1);
		garage.addVehicle(car1);
		garage.addVehicle(motorbike1);
		garage.addVehicle(boat2);
		garage.addVehicle(car2);
		garage.addVehicle(motorbike2);
		
		garage.printGarage();
		
		//Fix Vehicle
		garage.fixVehicle();
		
		//Remove Vehicle by iD
		garage.findRemoveVehicleiD(4);
		
		//Remove Vehicle by Type (Removes all in type)
		garage.findRemoveVehicleType("car");
		
		//Empty Garage
		garage.emptyGarage(0);	
	}
}
