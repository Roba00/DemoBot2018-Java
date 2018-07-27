package org.usfirst.frc.team4646.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4646.robot.commands.DriveCommand;
import org.usfirst.frc.team4646.robot.subsystems.DriveTrainSubsystem;

public class Robot extends TimedRobot
{
	public static DriveTrainSubsystem driveTrain = new DriveTrainSubsystem();
	public static OI oi;

	Command teleopCommand;

	@Override
	public void robotInit()
	{
		oi = new OI();
		teleopCommand = new DriveCommand();
		SmartDashboard.putData(driveTrain);
		SmartDashboard.putBoolean("Tank Drive Mode", true);
	}

	@Override
	public void disabledInit()
	{

	}

	@Override
	public void disabledPeriodic()
	{
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit()
	{
	}

	@Override
	public void autonomousPeriodic()
	{
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit()
	{
		teleopCommand.start();
	}

	@Override
	public void teleopPeriodic()
	{
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic()
	{
	}
}
