package edu.wmich.wshen.ooparadigm.example;

public class Computer {
	/*
	 * This is the first version of the Java program. Quite similar to C code. No OO "Culture" here.
	 */
	
	private Boolean on;
	
	private PowerVia3Legs power;

	public PowerVia3Legs getPower() {
		return power;
	}

	public void setPower(PowerVia3Legs power) {
		this.power = power;
	}

	public void turn_on()
	{  on = power.get_power_via_3leg();
	      if(on)
	         System.out.println("Power is on");
	}
	
//	public Boolean get_power_via_3leg(){
//        System.out.println("Power is generated");
//        return true;
//    }
	
//	public static void main(String[] args)
//	{
//		Computer c = new Computer();
//		PowerVia3Legs p = new PowerVia3Legs();
//		c.setPower(p);
//		c.turn_on();
//	}



}
