// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.JoyUtil;

/** A command used to test JoyUtil with SmartDashboard. */
public class TestJoyutilCommand extends CommandBase {
  JoyUtil m_joyUtil;

  /**
   * Creates a new ExampleCommand.
   */
  public TestJoyutilCommand(JoyUtil joyUtil) {
    m_joyUtil = joyUtil;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    SmartDashboard.putNumber("Left X", m_joyUtil.getLeftX());
    SmartDashboard.putNumber("Left Y", m_joyUtil.getLeftY());
    SmartDashboard.putNumber("Right X", m_joyUtil.getRightX());
    SmartDashboard.putNumber("Right Y", m_joyUtil.getRightY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
