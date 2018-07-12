package org.usfirst.frc.team7327.robot.commands;

import org.usfirst.frc.team7327.robot.Robot;


//import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Servo;

public class TankDrive extends Command {
	XboxController Player1 = Robot.oi.Controller0;
	XboxController Player2 = Robot.oi.Controller1;
	double throttleL = 0.25;
	double throttleA = 0.35;
	
	public TankDrive() {
		requires(Robot.drivetrain); 
	}
	
	protected void execute(){
	//Robot.drivetrain.setRaw1(Robot.oi.getLeftStickY(Player1)*-throttleL, Robot.oi.getRightStickY(Player1)*-throttleL);
	Robot.drivetrain.setRawArm(Robot.oi.getRightStickY(Player1)*throttleA);
	}
	
	
	protected boolean isFinished() {
		return false;
	}

	protected void interrupted() {
		end();
	}
}