class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}

}
