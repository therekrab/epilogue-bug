package frc.robot;

import edu.wpi.first.epilogue.Logged;

@Logged
public class SomeNotLoggedClass {
  private int loggedInt = 34;

  public int getInt() {
    return loggedInt;
  }
}
