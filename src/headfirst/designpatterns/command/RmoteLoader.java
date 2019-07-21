package headfirst.designpatterns.command;

import headfirst.designpatterns.command.bean.CeilingFan;
import headfirst.designpatterns.command.bean.Light;
import headfirst.designpatterns.command.command.CeilingFanHighCommand;
import headfirst.designpatterns.command.command.CeilingFanMediumCommand;
import headfirst.designpatterns.command.command.CeilingFanOffCommand;
import headfirst.designpatterns.command.command.LightOffCommand;
import headfirst.designpatterns.command.command.LightOnCommand;

public class RmoteLoader {

    public static void main(String[] args) {
        // 调用者
        RemoteControl remoteControl = new RemoteControl();

        // 接收者
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        // 命令对象
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn, kitchenLightOff);

        // 通知命令对象执行命令
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);


        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControlWithUndo.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControlWithUndo.setCommand(1,ceilingFanHigh, ceilingFanOff);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.undoButtonWasPushed();


    }


}
