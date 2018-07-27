package org.usfirst.frc.team4646.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4646.robot.Robot;
import org.usfirst.frc.team4646.robot.subsystems.DriveTrainSubsystem;
import org.usfirst.frc.team4646.robot.OI;

public class DriveCommand extends Command
{
	public DriveCommand()
	{

		requires(Robot.driveTrain);
	}

	@Override
	protected void initialize()
	{
	}

	@Override
	protected void execute()
	{
		if (SmartDashboard.getBoolean("Tank Drive Mode", true))
		{
			DriveTrainSubsystem.robotDrive.tankDrive(OI.getStick1Y(), OI.getStick2Y());
		} else if (SmartDashboard.getBoolean("Tank Drive Mode", false))
		{
			DriveTrainSubsystem.robotDrive.arcadeDrive(OI.getStick1Y(), OI.getStick2Y());
		} else
		{
			DriveTrainSubsystem.robotDrive.tankDrive(OI.getStick1Y(), OI.getStick2Y());
		}
	}

	@Override
	protected boolean isFinished()
	{
		return false;
	}

	@Override
	protected void end()
	{
	}

	@Override
	protected void interrupted()
	{
	}
}
