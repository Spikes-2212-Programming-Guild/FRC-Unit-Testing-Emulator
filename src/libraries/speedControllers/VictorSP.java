/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.speedControllers;

/**
 *
 * @author ThinkRedstone
 */
public class VictorSP {

    double speed;

    public VictorSP(int port) {
    }

    public void set(double speed) {
        this.speed = speed;
    }

    public double get() {
        return speed;
    }

}
