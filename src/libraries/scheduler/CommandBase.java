/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.scheduler;

import libraries.commandBased.Command;

/**
 *
 * @author ThinkRedstone
 */
public abstract class CommandBase extends Command {

    public static OI oi;

    // Create a single static instance of all of your subsystems    
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
    }

    public CommandBase() {
        super();
    }

}
