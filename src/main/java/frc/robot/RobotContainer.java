// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.epilogue.Logged;

// @Logged <- Uncommenting this enables logging for the SomeLoggedClass class, which is weird.
public class RobotContainer {

  // Notice that we don't put @Logged anywhere in this class. This seems to tell Epilogue to not log
  // anything here and to simply stop checking for logged files. Or at least that's the impression I
  // get.
  public SomeNotLoggedClass snlc = new SomeNotLoggedClass();

  public RobotContainer() {}
}
