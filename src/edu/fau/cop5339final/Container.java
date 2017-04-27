package edu.fau.cop5339final;

public class Container {
	
	public String containerID;
	public double volumeInCubicMeters;
	public double weightInKGs;
	
	public DatabaseAdapter database = new DatabaseAdapter(new Database());
	
	public Container(String containerID, double volumeInCubicMeters, double weightInKGs) {
		this.containerID = containerID;
		this.volumeInCubicMeters = volumeInCubicMeters;
		this.weightInKGs = weightInKGs;
	}
	
	public void writeData(String dataToWrite) {
		this.database.writeData(dataToWrite);
	}

}
