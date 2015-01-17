/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.commandBased;

import java.util.ArrayList;

/**
 *
 * @author 207797739
 */
public class CommandGroup extends Command {

    private ArrayList<ArrayList<Command>> commands = new ArrayList<>();
    //what command block are we currently building
    private int currentCommandBlock = 0;
    //-1 for no block is running
    private int runningBlock = -1;

    public CommandGroup() {
        //intializes the first block
        commands.add(new ArrayList<>());
    }

    protected void addParallel(Command command) {
        //adds the command to the block without moving to a new one
        commands.get(currentCommandBlock).add(command);
    }

    protected void addSequential(Command command) {
        //adds command then makes a new block and moves into using it
        addParallel(command);
        commands.add(new ArrayList<>());
        currentCommandBlock++;
    }

    private void runBlock(int blockNum) {
        runningBlock = blockNum;
        for (Command c : commands.get(blockNum)) {
            c.start();
        }
    }

    private boolean blockFinished(int blockNum) {
        if (blockNum > -1) {
            return commands.get(blockNum).get(commands.get(blockNum).size() - 1).isFinished();
        } else {
            return true;
        }
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        if (blockFinished(runningBlock)) {
            runningBlock++;
            runBlock(runningBlock);
        } else {
            for (Command c : commands.get(runningBlock)) {
                if (c.isInterrupted()) {
                    interrupt();
                }
            }
        }

    }

    @Override
    protected void end() {
        //resets running block
        runningBlock = -1;
    }

    @Override
    protected void interrupted() {
        for (Command c : commands.get(runningBlock)) {
            interrupt();
        }
        end();
    }

    @Override
    protected boolean isFinished() {
        //checks if the last block in commands finished
        return blockFinished(commands.get(commands.size() - 1).size());
    }

}
