package edu.fau.cop5339final;

public class DatabaseAdapter implements Adapter {

	private Database database;
	
	public DatabaseAdapter(Database database) {
		this.database = database;
	}
	
	@Override
	public void writeData(String table, String dataToWrite) {
		database.databaseQuery(table, dataToWrite);
	}

}
