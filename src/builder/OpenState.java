package builder;

public class OpenState implements State {
	DoorKnobStates doorKnobStates;
	public OpenState(DoorKnobStates doorKnobStates) {
		this.doorKnobStates = doorKnobStates;
	}

	@Override
	public void lock() {
		System.out.println("Close the door fist");

	}

	@Override
	public void unlock() {
		System.out.println("The door is open");

	}

	@Override
	public void getIn() {
		System.out.println("Getting in");

	}
	public void open() {
		System.out.println("The Door is open");


	}
	public void close() {
		System.out.println("Closing the door");
		doorKnobStates.setState(doorKnobStates.getClosedState());
	}
	@Override
	public void getOut() {
		System.out.println("Getting out made the knob faulty");
		doorKnobStates.setState(doorKnobStates.getFaultyState());

	}
	public void repair() {
		System.out.println("Door knob not faulty yet");
	}
	public String toString() {
		return " open state";
	}

}
