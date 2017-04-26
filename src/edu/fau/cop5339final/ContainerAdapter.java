package edu.fau.cop5339final;

public class ContainerAdapter implements Database {

	Container container;
	
	public ContainerAdapter (Container container) {
		this.container = container;
	}
	
	@Override
	public void writeData(String dataToWrite) {
		// TODO Auto-generated method stub
		
	}

}
