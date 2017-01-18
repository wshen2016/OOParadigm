package edu.wmich.wshen.ooparadigm.example;

public class Application {

	public static void main(String[] args) {
		Computer c = new Computer();
//		PowerVia3Legs p = new PowerVia3Legs();
		Adapter adapter = new Adapter();
		PowerVia2Legs p2 = new PowerVia2Legs();
// 	    c.setPower(p2); // it does not work.		
		c.setPower(adapter);
		adapter.setConnectedTo(p2);
		c.turn_on();

	}

}
