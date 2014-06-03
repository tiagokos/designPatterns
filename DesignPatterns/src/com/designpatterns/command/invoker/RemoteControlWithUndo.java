package com.designpatterns.command.invoker;

import com.designpatterns.command.Command;
import com.designpatterns.command.NoCommand;

public class RemoteControlWithUndo {
	
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControlWithUndo() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		if (onCommands[slot] != null) {
			onCommands[slot].execute();
			undoCommand = onCommands[slot];
		}
	}
	
	public void offButtonWasPushed(int slot) {
		if (offCommands[slot] != null) {
			offCommands[slot].execute();
			undoCommand = offCommands[slot];
		}
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n------ Remote Control ------\n");
		for (int i = 0; i < 7; i++) {
			sb.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "      " + offCommands[i].getClass().getName() + "\n");
		}
		sb.append("[undo] " + undoCommand.getClass().getName() + "\n");
		return sb.toString();
	}

}
