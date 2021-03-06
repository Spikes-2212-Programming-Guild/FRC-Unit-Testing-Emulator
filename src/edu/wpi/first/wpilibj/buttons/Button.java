/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.buttons;

import java.util.ArrayList;
import java.util.Vector;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author ThinkRedstone
 */
public abstract class Button {

    protected Command whenPressed;
    protected Command whileHeld;
    public static ArrayList<Button> buttons = new ArrayList<>();

    public Button() {
        buttons.add(this);
    }

    public void whenPressed(Command command) {
        whenPressed = command;
    }

    public void whileHeld(Command command) {
        whileHeld = command;
    }

    public abstract void run();
}
