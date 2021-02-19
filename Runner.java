package VehicleChallenge;

public class Runner {
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car car1 = new Car("car", 1, "Vauxhall", "Grey", 2014, 6, 200);		
		Motorbike motorbike1 = new Motorbike("motorbike", 2, "Honda", "Red", 2019, 150);
		Boat boat1 = new Boat("boat", 3, "AVA Yachts", "White", 2012, 3500);
		Boat boat2 = new Boat("boat", 4, "AVA Yachts", "Black", 2020, 1700);
		Car car2 = new Car("car", 5, "BMW", "Black", 2018, 7, 200);	
		Motorbike motorbike2 = new Motorbike("motorbike", 6, "Honda", "Black", 2021, 150);
		
		// adds Vehicles
		garage.addVehicle(boat1);
		garage.addVehicle(car1);
		garage.addVehicle(motorbike1);
		garage.addVehicle(boat2);
		garage.addVehicle(car2);
		garage.addVehicle(motorbike2);
		
		garage.printGarage();
		
		//Fix Vehicle (Print All Bills)
		garage.fixBillVehicle();
		
		//Fix Vehicle (Print 1 Bill)
		garage.fixSpecificBillVehicle(car2);
		
		//Remove Vehicle by iD
		garage.findRemoveVehicleiD(4);
		
		//To remove one vehicle in a type (Find Vehicle iD you want to delete)
		garage.findVehicleiD("car");
		
		//Remove Vehicle by Type (Removes all in type)
		garage.findRemoveVehicleType("car");
		
		//Empty Garage
		garage.emptyGarage(0);	
	}
}
