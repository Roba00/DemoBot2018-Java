package org.usfirst.frc.team4646.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4646.robot.commands.FlagWaveCommand;

public class FlagSubsystem extends Subsystem
{
	// Flag-waving command and subsystem is incomplete.
	public void initDefaultCommand()
	{
		setDefaultCommand(new FlagWaveCommand());
	}
}
