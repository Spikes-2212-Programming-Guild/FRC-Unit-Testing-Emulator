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
public class Joystick {
    private int port;

    public Joystick(int port) {
        this.port = port;
    }
    public boolean getRawButton(int buttonNum){
        return false;
    }

    public double getX() {
        return 1;
    }

    public double getY() {
        return 1;
    }
    
}
