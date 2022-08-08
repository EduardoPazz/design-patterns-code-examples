class SimpleRemoteControl {
	Command slot;

	void setCommand(Command command) {
		slot = command;
	}

	public void onButtonPress() {
		slot.execute();
	}

}
