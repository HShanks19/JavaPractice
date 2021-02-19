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
	
	public void fixVehicle() {
		for (int i = 0; i < Garage.size(); i++) {
			Vehicle currentVehicle = Garage.get(i);
			currentVehicle.print();
			if (currentVehicle instanceof Car) {
				System.out.println("Fixed Car Bill: £250");
			} else if (currentVehicle instanceof Motorbike) {
				System.out.println("Fixed Motorbike Bill: £50");
			} else if (currentVehicle instanceof Boat) {
				System.out.println("Fixed Boat Bill: £1050");
			} else {
				System.out.println("Unknown Vehicle: £5000");
			}
		}
	}
	
	public void removeVehicle(Vehicle car0) {
		Garage.remove(car0);
	}
	
	public void findRemoveVehicleiD (int x) {
		for (int i = 0; i < Garage.size(); i++) {
			Vehicle currentVehicle = Garage.get(i);
			int y = currentVehicle.getVehicleiD();
			if (y == x) {
				removeVehicle(currentVehicle);
				System.out.println("The following Vehicle has been removed. Vehicle iD: " + y);
			}
		}
	}
	
	public void findRemoveVehicleType (String X) {
			for (int i = 0; i < Garage.size(); i++) {
			Vehicle currentVehicle = Garage.get(i);
			String y = currentVehicle.getvehicleType();
			int z = currentVehicle.getVehicleiD();
			if (y == X) {
				removeVehicle(currentVehicle);
				System.out.println("The following Vehicle has been removed. Vehicle iD: " + z);
			}
		}
	}
	
	public void emptyGarage(int x) {
		Garage.clear();
		System.out.println("Garage has been emptied");
	}
}

	
	
	

