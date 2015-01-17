/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.speedControllers;

/**
 *
 * @author Developer
 */
public class Talon {

    double speed;

    public Talon(int port) {
    }

    public void set(double speed) {
        this.speed = speed;
    }

    public double get() {
        return speed;
    }

}
