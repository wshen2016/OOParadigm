package edu.wmich.wshen.ooparadigm.example;

public class Adapter extends PowerVia3Legs {
	
	private PowerVia2Legs connectedTo;
	
	public Boolean get_power_via_3leg(){
	      System.out.println("This is an adapter connected to PowerVia2Legs ...");
	      return connectedTo.get_power_via_2leg();
	    }

	public PowerVia2Legs getConnectedTo() {
		return connectedTo;
	}

	public void setConnectedTo(PowerVia2Legs connectedTo) {
		this.connectedTo = connectedTo;
	}

}
