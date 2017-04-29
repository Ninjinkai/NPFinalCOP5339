package edu.fau.cop5339final;

public class Warehouse {
	
	public String warehouseID;
	public int numberOfLocations;
	
	public DatabaseAdapter database = new DatabaseAdapter(new Database());
	
	public Warehouse(String warehouseID, int numberOfLocations) {
		this.warehouseID = warehouseID;
		this.numberOfLocations = numberOfLocations;
	}

	public boolean assignLocation(Container container, int locationNumber) {
		if (locationNumber > 0 && locationNumber <= this.numberOfLocations) {
			container.assignedWarehouse = this.warehouseID;
			container.warehouseLocationNumber = locationNumber;
			
			this.database.writeData("W_LOCATION",
					"locationNumber (primary key): " + locationNumber + "\n" +
					"warehouseID: " + this.warehouseID + "\n" +
					"containerID: " + container.containerID
					);
			
			return true;
		}
		
		return false;
		
	}

}
