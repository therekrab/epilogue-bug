// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public class RobotContainer {

  // Notice that we don't put @Logged anywhere in this class. This seems to tell Epilogue to not log
  // anything here and to simply stop checking for logged files. Or at least that's the impression I
  // get.
  private SomeLoggedClass snlc = new SomeLoggedClass();

  public RobotContainer() {}
}
