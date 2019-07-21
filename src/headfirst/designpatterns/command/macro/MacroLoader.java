package headfirst.designpatterns.command.macro;

import headfirst.designpatterns.command.bean.Light;
import headfirst.designpatterns.command.bean.Stereo;
import headfirst.designpatterns.command.bean.TV;
import headfirst.designpatterns.command.command.Command;
import headfirst.designpatterns.command.command.LightOffCommand;
import headfirst.designpatterns.command.command.LightOnCommand;
import headfirst.designpatterns.command.command.StereoOffWithCDCommand;
import headfirst.designpatterns.command.command.StereoOnWithCDCommand;
import headfirst.designpatterns.command.command.TVOffCommand;
import headfirst.designpatterns.command.command.TVOnCommand;

public class MacroLoader {

    public static void main(String[] args) {
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        Command[] partyOn = {lightOnCommand, tvOnCommand, stereoOnWithCDCommand};
        Command[] partyOff = {lightOffCommand, tvOffCommand, stereoOffWithCDCommand};


        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteMacroControlWithUndo remoteMacroControlWithUndo = new RemoteMacroControlWithUndo();
        remoteMacroControlWithUndo.setCommand(0, partyOnMacro, partyOffMacro);

        remoteMacroControlWithUndo.onButtonWasPushed(0);
        remoteMacroControlWithUndo.offButtonWasPushed(0);
        remoteMacroControlWithUndo.undoButtonWasPushed();
    }

}
