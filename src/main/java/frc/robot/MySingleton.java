package frc.robot;

import edu.wpi.first.epilogue.Logged;

@Logged(name="My Singleton") // Even with a name, this still doesn't log the `aCoolTeam` field.
public class MySingleton {
  private static MySingleton instance;

  private MySingleton() {}

  public int aCoolTeam = 3414;

  public static MySingleton getInstance() {
    if (instance == null) {
      instance = new MySingleton();
    }
    return instance;
  }
}
