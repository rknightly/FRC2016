package org.impact2585.frc2016.input;

import edu.wpi.first.wpilibj.Joystick;

import org.impact2585.lib2585.XboxConstants;

/**
 * Uses Xbox controller for input
 */
public class XboxInput implements InputMethod{

	private Joystick controller;
	
	/**
	 * Constructor that initializes new joystick
	 */
	public XboxInput() {
		controller = new Joystick(0);
	}
	
	/**Constructor that sets joystick controller to joystick
	 * @param joystick the joystick the input is using
	 */
	public XboxInput(Joystick joystick) {
		controller = joystick;
	}

	/* (non-Javadoc)
	 * @see org.impact2585.frc2016.input.InputMethod#forwardMovement()
	 */
	@Override
	public double forwardMovement() {
		return -controller.getRawAxis(XboxConstants.LEFT_Y_AXIS);
	}

	/* (non-Javadoc)
	 * @see org.impact2585.frc2016.input.InputMethod#rotationValue()
	 */
	@Override
	public double rotationValue() {
		return controller.getRawAxis(XboxConstants.RIGHT_X_AXIS);
	}

	/* (non-Javadoc)
	 * @see org.impact2585.frc2016.input.InputMethod#setInverted()
	 */
	@Override
	public boolean invert() {
		return controller.getRawButton(XboxConstants.Y_BUTTON);
	}

	/* (non-Javadoc)
	 * @see org.impact2585.frc2016.input.InputMethod#topArmForward()
	 */
	@Override
	public boolean topArmForward() {
		return controller.getRawButton(XboxConstants.RIGHT_BUMPER);
	}

	/* (non-Javadoc)
	 * @see org.impact2585.frc2016.input.InputMethod#topArmBackward()
	 */
	@Override
	public boolean topArmBackward() {
		return controller.getRawButton(XboxConstants.LEFT_BUMPER);
	}

	/* (non-Javadoc)
	 * @see org.impact2585.frc2016.input.InputMethod#backArmForwardValue()
	 */
	@Override
	public double backArmForwardValue() {
		return controller.getRawAxis(XboxConstants.RIGHT_TRIGGER);
	}

	/* (non-Javadoc)
	 * @see org.impact2585.frc2016.input.InputMethod#backArmBackwardValue()
	 */
	@Override
	public double backArmBackwardValue() {
		return controller.getRawAxis(XboxConstants.LEFT_TRIGGER);
	}
	
	
	
}
