package edu.wmich.wshen.ooparadigm.example;

public class Computer {
	/*
	 * This is the first version of the Java program. Quite similar to C code. No OO "Culture" here.
	 */
	
	private Boolean on;

	public void turn_on()
	{  on = get_power_via_3leg();
	      if(on)
	         System.out.println("Power is on");
	}
	
	public Boolean get_power_via_3leg(){
        System.out.println("Power is generated");
        return true;
    }
	
	public static void main(String[] args)
	{
		Computer c = new Computer();
		c.turn_on();
	}



}
