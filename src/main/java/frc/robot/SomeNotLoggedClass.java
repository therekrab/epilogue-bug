package frc.robot;

import edu.wpi.first.epilogue.Logged;

// We can mark the class as logged:
@Logged
public class SomeNotLoggedClass {
  // This field is not logged
  private int loggedInt = 34;

  // Neither is this public accessor
  public int getInt() {
    return loggedInt;
  }
}
