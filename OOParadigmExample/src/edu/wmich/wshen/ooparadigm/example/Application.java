package edu.wmich.wshen.ooparadigm.example;

public class Application {

	public static void main(String[] args) {
		Computer c = new Computer();
		PowerVia3Legs p = new PowerVia3Legs();
		c.setPower(p);
		c.turn_on();

	}

}
