package com.designpatterns.command.client;

import com.designpatterns.command.Command;
import com.designpatterns.command.LightOnCommand;
import com.designpatterns.command.MacroCommand;
import com.designpatterns.command.receiver.Light;

public class RemoteLoader {
	
	public static void main(String[] args) {
		
		//Remote Control with Undo and Macro
//		Light light = new Light("Living Room");
//		TV tv = new TV("Living Room");
//		Stereo stereo = new Stereo("Living Room");
//		Hottub hottub = new Hottub();
//		
//		LightOnCommand loc = new LightOnCommand(light);
//		StereoOnCommand soc = new StereoOnCommand(stereo);
//		TVOnCommand toc = new TVOnCommand(tv);
//		HottubOnCommand hoc = new HottubOnCommand(hottub);
//		
//		Command[] partyOn = { loc, soc, toc, hoc };
//		Command[] partyOff = {loffc, soffc, toffc, hoffc };
//		
//		MacroCommand partyOnMacro = new MacroCommand(partyOn);
//		MacroCommand partyOffMacro = new MacroCommand(partyOff);
//		
//		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
//		
//		System.out.println(remoteControl);
//		System.out.println("--- Pushing Macro On ---");
//		remoteControl.onButtonWasPushed(0);
//		System.out.println("--- Pushing Macro Off ---");
//		remoteControl.offButtonWasPushed(0);
		
		//Remote Control with Undo
//		RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
//		
//		Light kitchenRoomLight = new Light("Kitchen");
//		
//		LightOnCommand klon = new LightOnCommand(kitchenRoomLight);
//		LightOffCommand kloff = new LightOffCommand(kitchenRoomLight); 
//		
//		remoteControlWithUndo.setCommand(0, klon, kloff);
//		
//		remoteControlWithUndo.onButtonWasPushed(0);
//		remoteControlWithUndo.offButtonWasPushed(0);
//		System.out.println(remoteControlWithUndo);
//		remoteControlWithUndo.undoButtonWasPushed();
//		remoteControlWithUndo.offButtonWasPushed(0);
//		remoteControlWithUndo.onButtonWasPushed(0);
//		System.out.println(remoteControlWithUndo);
//		remoteControlWithUndo.undoButtonWasPushed();
		
		//Remote Control
//		RemoteControl remoteControl = new RemoteControl();
//		
//		Light livingRoomLight = new Light("Living Room");
//		CeilingFan ceilingFan = new CeilingFan("Living Room");
//		
//		LightOnCommand lrlon = new LightOnCommand(livingRoomLight);
//		LightOffCommand lrloff = new LightOffCommand(livingRoomLight);
//		
//		CeilingFanOnCommand cfonc = new CeilingFanOnCommand(ceilingFan);
//		CeilingFanOffCommand cfoffc = new CeilingFanOffCommand(ceilingFan);
//		
//		remoteControl.setCommand(0, lrlon, lrloff);
//		remoteControl.setCommand(1, cfonc, cfoffc);
//
//		System.out.println(remoteControl);
//		
//		remoteControl.onButtonWasPushed(0);
//		remoteControl.offButtonWasPushed(0);
//		
//		remoteControl.onButtonWasPushed(1);
//		remoteControl.offButtonWasPushed(1);
		
	}

}
