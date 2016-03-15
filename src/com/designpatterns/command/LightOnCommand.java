package com.designpatterns.command;

import com.designpatterns.command.receiver.Light;

public class LightOnCommand implements Command {

	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.on();
	}
	
	public void undo() {
		light.off();
	}

}
