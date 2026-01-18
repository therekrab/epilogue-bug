package frc.robot;

import edu.wpi.first.epilogue.Logged;

// This class represents another class between Robot and SomeLoggedClass. Even if RobotContainer is
// @Logged, this class will still block SomeLoggedClass from logging anything.
public class SomeNotLoggedClass {
  public SomeLoggedClass aLoggedClass = new SomeLoggedClass();
}
