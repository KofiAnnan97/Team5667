/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team5667.robot.commands;

import org.usfirst.frc.team5667.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Have the robot drive tank style using the PS3 Joystick until interrupted.
 */
public class TankDriveWithJoystick extends Command {
    
    public TankDriveWithJoystick() {
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.drivetrain.drive(Robot.oi.getJoystick());
        
        System.out.print("\n \n \n \n \nX + | ");
        for (int i=0; i<(int)(Robot.oi.getJoystick().getX()*-10);i++)
        	System.out.print('#');
        
        System.out.print("\nX - | ");
        for (int i=0; i<(int)(Robot.oi.getJoystick().getX()*10);i++)
        	System.out.print('#');
        
        System.out.print("\nY + | ");
        for (int i=0; i<(int)(Robot.oi.getJoystick().getRawAxis(0)*10);i++)
        	System.out.print('#');
        
        System.out.print("\nY - | ");
        for (int i=0; i<(int)(Robot.oi.getJoystick().getRawAxis(0)*-10);i++)
        	System.out.print('#');
        
        System.out.print("\nZ + | ");
        for (int i=0; i<(int)(Robot.oi.getJoystick().getZ()*-10);i++)
        	System.out.print('#');
        
        System.out.print("\nZ - | ");
        for (int i=0; i<(int)(Robot.oi.getJoystick().getZ()*10);i++)
        	System.out.print('#');
        
        for(int x = 0;x < 500;x++)
        {
        	x++;
        }
       
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false; // Runs until interrupted
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.drivetrain.drive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
