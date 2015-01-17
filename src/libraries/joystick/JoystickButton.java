/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.joystick;

/**
 *
 * @author ThinkRedstone
 */
public class JoystickButton extends Button {

    private final Joystick joystick;
    private final int buttonNum;
    private boolean isPressed;

    public JoystickButton(Joystick joystick, int buttonNum) {
        this.joystick = joystick;
        this.buttonNum = buttonNum;
    }

    private boolean getFirstPress() {
        if (isPressed) {
            isPressed = joystick.getRawButton(buttonNum);
            return false;
        } else {
            isPressed = joystick.getRawButton(buttonNum);
            return joystick.getRawButton(buttonNum);
        }
    }

    @Override
    public void run() {
        if (getFirstPress()) {
            whenPressed.start();
            whileHeld.start();
        }
        if (!joystick.getRawButton(buttonNum)) {
            whileHeld.cancel();
        }
    }
}
