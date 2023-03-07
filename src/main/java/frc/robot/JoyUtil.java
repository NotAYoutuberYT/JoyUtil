package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

/**
 * <> {@link CommandXboxController} with many joystick tweaks in addition
 * to various other helper functions. All around a swell time :)
 */
public class JoyUtil extends CommandXboxController {
  private final double deadzone;
  private final double rateLimitLeft, rateLimitRight;
  private final double exponent1, exponent2, coefficient1, coefficient2;
  private final double leftTriggerLeftStickMultiplier, rightTriggerLeftStickMultiplier;
  private final double leftTriggerRightStickMultiplier, rightTriggerRightStickMultiplier;

  public JoyUtil(int port, double deadzone, double rateLimitLeft, double rateLimitRight, double exponent1,
                 double exponent2, double coefficient1, double coefficient2, double leftTriggerLeftStickMultiplier,
                 double rightTriggerLeftStickMultiplier, double leftTriggerRightStickMultiplier,
                 double rightTriggerRightStickMultiplier) {
    super(port);

    this.deadzone = deadzone;

    this.rateLimitLeft = rateLimitLeft;
    this.rateLimitRight = rateLimitRight;

    this.exponent1 = exponent1;
    this.exponent2 = exponent2;
    this.coefficient1 = coefficient1;
    this.coefficient2 = coefficient2;

    this.leftTriggerLeftStickMultiplier = leftTriggerLeftStickMultiplier;
    this.rightTriggerLeftStickMultiplier = rightTriggerLeftStickMultiplier;
    this.leftTriggerRightStickMultiplier = leftTriggerRightStickMultiplier;
    this.rightTriggerRightStickMultiplier = rightTriggerRightStickMultiplier;
  }


}
