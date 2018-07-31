package org.usfirst.frc.team4646.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4646.robot.commands.DriveCommand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class DriveTrainSubsystem extends Subsystem
{
	static Spark leftBigDrive = new Spark(2);
	static Spark leftMiniDrive = new Spark(3);
	static Spark rightBigDrive = new Spark(0);
	static Spark rightMiniDrive = new Spark(1);

	static SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(leftMiniDrive, leftBigDrive);
	static SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(rightMiniDrive, rightBigDrive);

	public static DifferentialDrive robotDrive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);

	public void initDefaultCommand()
	{
		setDefaultCommand(new DriveCommand());
	}
}
