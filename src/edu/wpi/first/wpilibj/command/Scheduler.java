/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.command;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 *
 * @author ThinkRedstone
 */
public class Scheduler {
    private static Scheduler instance;

    public static Scheduler getInstance() {
        instance  = new Scheduler();
        return instance;
    }
    

    public void run() {
        for (Button b : Button.buttons) {
            b.run();
        }
    }
}
