package org.usfirst.frc.team4646.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI
{
	public static Joystick joystick1 = new Joystick(0);
	public static Joystick joystick2 = new Joystick(1);

	public static double getStick1Y()
	{
		return -joystick1.getY();
	}

	public static double getStick2Y()
	{
		return -joystick2.getY();
	}

	public static double getStick1X()
	{
		return joystick1.getX();
	}
}
