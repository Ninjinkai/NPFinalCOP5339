package edu.fau.cop5339final;

public class Container {
	
	public String containerID;
	public double volumeInCubicMeters;
	public double weightInKGs;
	
	public Container(String containerID, double volumeInCubicMeters, double weightInKGs) {
		this.containerID = containerID;
		this.volumeInCubicMeters = volumeInCubicMeters;
		this.weightInKGs = weightInKGs;
	}

}
