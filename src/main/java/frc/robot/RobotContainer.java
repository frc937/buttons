// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.PrintCommand;
import edu.wpi.first.wpilibj2.command.button.CommandGenericHID;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final CommandGenericHID controller =
      new CommandGenericHID(OperatorConstants.CONTROLLER_PORT);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
    /* Don't worry, I didn't write this BS boilerplate by hand. I generated it with a python script. */
    controller.button(0).whileTrue(getButtonPrintCommand(0));
    controller.button(1).whileTrue(getButtonPrintCommand(1));
    controller.button(2).whileTrue(getButtonPrintCommand(2));
    controller.button(3).whileTrue(getButtonPrintCommand(3));
    controller.button(4).whileTrue(getButtonPrintCommand(4));
    controller.button(5).whileTrue(getButtonPrintCommand(5));
    controller.button(6).whileTrue(getButtonPrintCommand(6));
    controller.button(7).whileTrue(getButtonPrintCommand(7));
    controller.button(8).whileTrue(getButtonPrintCommand(8));
    controller.button(9).whileTrue(getButtonPrintCommand(9));
    controller.button(10).whileTrue(getButtonPrintCommand(10));
    controller.button(11).whileTrue(getButtonPrintCommand(11));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }

  private Command getButtonPrintCommand(int button) {
    return new PrintCommand("Button " + button + " pressed");
  }
}
