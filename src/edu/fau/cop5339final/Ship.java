package edu.fau.cop5339final;

public class Ship {
	
	public String shipID;
	public String shipName;
	public String berth;
	
	public DatabaseAdapter database = new DatabaseAdapter(new Database());
	
	public Ship(String shipID, String shipName) {
		this.shipID = shipID;
		this.shipName = shipName;
	}

	public void arrive(String berth) {
		this.berth = berth;
		this.database.writeData("VESSEL",
				"shipID (primary key): " + shipID + "\n" +
				"shipName: " + shipName + "\n" +
				"berth: " + berth
				);
	}

	public Container unload(String containerID, double volumeInCubicMeters, double weightInKGs) {
		return new Container(containerID, volumeInCubicMeters, weightInKGs);
	}

}
