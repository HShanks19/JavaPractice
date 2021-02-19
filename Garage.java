package VehicleChallenge;

import java.util.ArrayList;

public class Garage {
	
	public ArrayList<Vehicle> Garage = new ArrayList<>();
	
	public void addVehicle(Vehicle car0) {
		Garage.add(car0);
	}
	
	public void printGarage() {
		for (int i = 0; i < Garage.size(); i++) {
			Vehicle currentVehicle = Garage.get(i);
			currentVehicle.print();
		}
    }
	
	public void fixBillVehicle() {
		for (int i = 0; i < Garage.size(); i++) {
			Vehicle currentVehicle = Garage.get(i);
			currentVehicle.printBill();
		}
	}
	public void fixSpecificBillVehicle(Vehicle car0) {
		System.out.println("Bill has been generated for the following vehicle. Vehicle iD: " + car0.getVehicleiD() + " " + "Make: "+ car0.getVehicleMake());
		car0.printBill();
	}	
	
	public void removeVehicle(Vehicle car0) {
		Garage.remove(car0);
	}
	
	public void findRemoveVehicleiD (int x) {
		for (int i = 0; i < Garage.size(); i++) {
			Vehicle currentVehicle = Garage.get(i);
			if (currentVehicle.getVehicleiD() == x) {
				removeVehicle(currentVehicle);
				System.out.println("The following Vehicle has been removed. Vehicle iD: " + currentVehicle.getVehicleiD());
			}
		}
	}
	public void findVehicleiD (String X) {
		System.out.println("The following results have been found for type: " + X);
		for (int i = 0; i < Garage.size(); i++) {
			Vehicle currentVehicle = Garage.get(i);
			if (currentVehicle.getvehicleType() == X) {
				currentVehicle.print();
			}
		}
	}
	
	public void findRemoveVehicleType (String X) {
		System.out.println("The following Vehicles have been removed.");	
		for (int i = 0; i < Garage.size(); i++) {
			Vehicle currentVehicle = Garage.get(i);
			if (currentVehicle.getvehicleType() == X) {
				removeVehicle(currentVehicle);
				System.out.println( "Vehicle iD: " + currentVehicle.getVehicleiD());
			}
		}
	}
	
	public void emptyGarage(int x) {
		Garage.clear();
		System.out.println("Garage has been emptied");
	}
}

// Old Billing Method
//public void fixVehicle() {
//	for (int i = 0; i < Garage.size(); i++) {
//		Vehicle currentVehicle = Garage.get(i);
//		currentVehicle.print();
//		if (currentVehicle instanceof Car) {
//			System.out.println("Fixed Car Bill: £250");
//		} else if (currentVehicle instanceof Motorbike) {
//			System.out.println("Fixed Motorbike Bill: £50");
//		} else if (currentVehicle instanceof Boat) {
//			System.out.println("Fixed Boat Bill: £1050");
//		} else {
//			System.out.println("Unknown Vehicle: £5000");
//		}
//	}
//}
	
	
	

