package edu.fau.cop5339final;

public class Container {
	
	public String containerID;
	public double volumeInCubicMeters;
	public double weightInKGs;
	public String assignedWarehouse;
	public int warehouseLocationNumber;
	
	public DatabaseAdapter database = new DatabaseAdapter(new Database());
	
	public Container(String containerID, double volumeInCubicMeters, double weightInKGs) {
		this.containerID = containerID;
		this.volumeInCubicMeters = volumeInCubicMeters;
		this.weightInKGs = weightInKGs;
	}

	public void writeToDatabase() {
		this.database.writeData("CARGO_UNIT",
				"containerID (primary key): " + containerID + "\n" +
				"volumeInCubicMeters: " + String.valueOf(volumeInCubicMeters) + "\n" +
				"weightInKGs: " + String.valueOf(weightInKGs) + "\n" +
				"assignedWarehouse: " + assignedWarehouse + "\n" +
				"warehouseLocationNumber: " + String.valueOf(warehouseLocationNumber)
				);
		
	}

}
