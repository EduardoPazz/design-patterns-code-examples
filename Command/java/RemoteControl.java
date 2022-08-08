import java.util.Arrays;

class RemoteControl {
	static final int MAX_SLOTS = 7;

	Command[] onCommands = new Command[MAX_SLOTS];
	Command[] offCommands = new Command[MAX_SLOTS];

	RemoteControl(Command[] offCommands) {
		NoCommand noCommand = new NoCommand();
		Arrays.fill(onCommands, noCommand);
		Arrays.fill(offCommands, noCommand);
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonPush(int slot) {
		onCommands[slot].execute();
	}

	public void offButtonPush(int slot) {
		offCommands[slot].execute();
	}

	public static void main(String[] args) {
		RemoteControl remoteControl1 = new RemoteControl(new Command[3]);
		Light light = new Light();
		remoteControl1.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
		remoteControl1.onButtonPush(0);
		remoteControl1.offButtonPush(0);
	}

}
