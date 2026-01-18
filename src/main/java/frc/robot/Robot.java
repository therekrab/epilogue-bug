// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.epilogue.Epilogue;
import edu.wpi.first.epilogue.Logged;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

// We put the necessary @Logged annotation here
@Logged
public class Robot extends TimedRobot {
  // Here we create an instance of the (not explicitly) logged RobotContainer class, which contains
  // an instance of another class (again not explicitly logged), which in turn contains an instance
  // of a class marked as @Logged:
  private final RobotContainer m_robotContainer;

  public Robot() {
    m_robotContainer = new RobotContainer();
    // Ensure Epilogue is running
    Epilogue.bind(this);

    // Make sure to actually use the class, so it has an instance.
    System.out.println("A cool FRC team: " + MySingleton.getInstance().aCoolTeam);
  }

  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
  }
}
