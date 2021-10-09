package builder;

public class ClosedState implements State {
	DoorKnobStates doorKnobStates;
	public ClosedState(DoorKnobStates doorKnobStates) {
		this.doorKnobStates = doorKnobStates;
	}

	@Override
	public void lock() {
		System.out.println("The door locked");
		doorKnobStates.setState(doorKnobStates.getLockedState());

	}

	@Override
	public void unlock() {
		System.out.println("The door is not locked");
		doorKnobStates.setState(doorKnobStates.getUnlockedState());
	}

	@Override
	public void getIn() {
		System.out.println("Open the door first to get in");

	}

	@Override
	public void getOut() {
		System.out.println("Open the door first to get out");

	}
	public void close() {
		System.out.println("The door is closed but the door knob was faulty");
		doorKnobStates.setState(doorKnobStates.getFaultyState());
	}
	public void open() {
		System.out.println("Opening the door");
		doorKnobStates.setState(doorKnobStates.getOpenState());
	}
	public void repair() {
		System.out.println("Door knob not faulty yet");
	}
	public String toString() {
		return " closed state";
	}

}
