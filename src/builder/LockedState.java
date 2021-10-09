package builder;

public class LockedState implements State {
	DoorKnobStates doorKnobStates;
	public LockedState(DoorKnobStates doorKnobStates) {
		this.doorKnobStates = doorKnobStates;
	}

	@Override
	public void lock() {

		System.out.println("The door is Locked");
	}

	@Override
	public void unlock() {

		System.out.println("Unlocking the door");
		doorKnobStates.setState(doorKnobStates.getUnlockedState());
	}

	@Override
	public void getIn() {
		System.out.println("Unlock the door first to get in");

	}

	@Override
	public void getOut() {
		System.out.println("Unlock the door first to get out");

	}
	public void open() {
		System.out.println("Unlock the doorknob to open the door");
	}
	public void close() {
		System.out.println("The door is closed");
	}
	public void repair() {
		System.out.println("Door knob not faulty yet");
	}
	public String toString() {
		return " locked state";
	}

}
