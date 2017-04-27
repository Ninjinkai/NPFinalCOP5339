package edu.fau.cop5339final;

public class Ship {
	
	public String shipID;
	
	public DatabaseAdapter database = new DatabaseAdapter(new Database());
	
	public void writeData(String dataToWrite) {
		this.database.writeData(dataToWrite);
	}

}
