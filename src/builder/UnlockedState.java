package builder;

public class UnlockedState implements State {
	DoorKnobStates doorKnobStates;
	public UnlockedState(DoorKnobStates doorKnobStates) {
		this.doorKnobStates = doorKnobStates;
	}

	@Override
	public void lock() {
		System.out.println("Locking the door");
		doorKnobStates.setState(doorKnobStates.getLockedState());
	}

	@Override
	public void unlock() {
		System.out.println("The door is unlocked");

	}

	@Override
	public void getIn() {
		System.out.println("Open the door first");

	}
	public void open() {
		System.out.println("Opening the door");
		doorKnobStates.setState(doorKnobStates.getOpenState());

	}
	public void close() {
		System.out.println("The door is closed");
	}
	@Override
	public void getOut() {
		System.out.println("Open the door first");

	}
	public void repair() {
		System.out.println("Door knob not faulty yet");
	}
	public String toString() {
		return " unlocked state";
	}

}
