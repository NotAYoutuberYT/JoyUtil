// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.JoyUtilConstants;
import frc.robot.Constants.OperatorConstants;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  private JoyUtil joyUtil;

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    joyUtil = new JoyUtil(OperatorConstants.kDriverControllerPort, JoyUtilConstants.kDeadzone,
      JoyUtilConstants.kRateLimitLeft, JoyUtilConstants.kRateLimitRight, JoyUtilConstants.exponent1,
      JoyUtilConstants.exponent2, JoyUtilConstants.coeff1, JoyUtilConstants.coeff2,
      JoyUtilConstants.leftTriggerSpeedMultiplier, JoyUtilConstants.rightTriggerSpeedMultiplier,
      JoyUtilConstants.leftTriggerSpeedMultiplier, JoyUtilConstants.rightTriggerSpeedMultiplier);
  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    // Runs the Scheduler.  This is responsible for polling buttons, adding newly-scheduled
    // commands, running already-scheduled commands, removing finished or interrupted commands,
    // and running subsystem periodic() methods.  This must be called from the robot's periodic
    // block in order for anything in the Command-based framework to work.
    CommandScheduler.getInstance().run();
  }

  /** This function is called once each time the robot enters Disabled mode. */
  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  /** This autonomous runs the autonomous command selected by your {@link RobotContainer} class. */
  @Override
  public void autonomousInit() {}

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {}

  @Override
  public void testInit() {
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {}

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {
    SmartDashboard.putNumber("joyutil left x", joyUtil.getLeftX());
    SmartDashboard.putNumber("joyutil left y", joyUtil.getLeftY());
    SmartDashboard.putNumber("joyutil right x", joyUtil.getRightX());
    SmartDashboard.putNumber("joyutil right y", joyUtil.getRightY());

    SmartDashboard.putBoolean("a", joyUtil.getAButton());
    SmartDashboard.putBoolean("b", joyUtil.getBButton());
    SmartDashboard.putBoolean("x", joyUtil.getXButton());
    SmartDashboard.putBoolean("y", joyUtil.getYButton());

    SmartDashboard.putBoolean("left bumper", joyUtil.getLeftBumper());
    SmartDashboard.putBoolean("right bumper", joyUtil.getRightBumper());

    SmartDashboard.putBoolean("left stick", joyUtil.getLeftStick());
    SmartDashboard.putBoolean("right stick", joyUtil.getRightStick());
  }
}
