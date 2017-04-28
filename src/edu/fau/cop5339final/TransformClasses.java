package edu.fau.cop5339final;

import java.util.Scanner;

public class TransformClasses {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		Create the Ship with its ID and name.
		System.out.println("What is the ID of the arriving ship? (String)");
		String shipID = scan.nextLine();
		System.out.println("What is the name of the arriving ship? (String)");
		String shipName = scan.nextLine();

		Ship ship = new Ship(shipID, shipName);
		
//		The Ship arrives, so it is assigned a berth.  The Ship's record
//		is written to the Database.
		System.out.println("What berth is the ship assigned to? (String)");
		String berth = scan.nextLine();
		System.out.println();
		
		ship.arrive(berth);
		
//		Create the Warehouse where the ship will unload its cargo.
		System.out.println("What is the ID of the warehouse the ship will use? (String)");
		String warehouseID = scan.nextLine();
		System.out.println("How many container locations does the warehouse have? (Integer)");
		String numberOfLocations = scan.nextLine();
		
		Warehouse warehouse = new Warehouse(warehouseID, Integer.parseInt(numberOfLocations));

		String decision = "yes";
		
		while (decision.equals("yes")) {
			
//			Unload a Container from the Ship, getting its ID, size, and weight.
			System.out.println("What is the ID of the unloaded container? (String)");
			String containerID = scan.nextLine();
			System.out.println("What is volume, in cubic meters, of the container? (Double)");
			String volumeInCubicMeters = scan.nextLine();
			System.out.println("What is weight, in kilograms, of the container? (Double)");
			String weightInKGs = scan.nextLine();
			
			Container container = ship.unload("containerID", Double.parseDouble(volumeInCubicMeters),
					Double.parseDouble(weightInKGs));
			
//			Assign the Container to the previously created Warehouse and
//			give Container a location inside the Warehouse.  If successful,
//			write the Warehouse's location record with the container to the
//			Database.
			System.out.println("Which location in the warehouse will the container go? (Integer)");
			String warehouseLocationNumber = scan.nextLine();
			System.out.println();
			
			while (!warehouse.assignLocation(container, Integer.parseInt(warehouseLocationNumber))) {
				System.out.println("That location is not valid, please select another. (Integer)");
				warehouseLocationNumber = scan.nextLine();
			}
			
//			The Container has been placed, write its record to the Database.
			container.writeToDatabase();
			
//			Allow another container to be unloaded.
			System.out.println("Unload another container? ('yes' to continue)");
			decision = scan.nextLine();
			System.out.println();
		}

		scan.close();
		
	}

}
