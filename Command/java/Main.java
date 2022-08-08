class Main {
	public static void main(String[] args) {
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

		var control = new SimpleRemoteControl();

		control.setCommand(lightOnCommand);
		control.onButtonPress();

		control.setCommand(garageDoorOpenCommand);
		control.onButtonPress();
	}
}
