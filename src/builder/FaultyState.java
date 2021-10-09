package builder;

public class FaultyState implements State {
	DoorKnobStates doorKnobStates;
	public FaultyState(DoorKnobStates doorKnobStates) {
		this.doorKnobStates = doorKnobStates;
	}

	@Override
	public void lock() {
		System.out.println("Doorknob faulty needs replacement");

	}

	@Override
	public void unlock() {
		System.out.println("DoorKnob faulty needs replacement");

	}

	@Override
	public void getIn() {
		System.out.println("Replace the doorknob to be able to get in");

	}

	@Override
	public void getOut() {
		System.out.println("Replace the doorknob to get out");

	}
	public void open() {
		System.out.println("Replace the doorknob to open");

	}
	public void close() {
		System.out.println("Replace the doorknob to close");
	}
	public void repair() {
		System.out.println("Door knob faulty");
		doorKnobStates.setState(doorKnobStates.getRepairState());
	}

	public String toString() {
		return " faulty state";
	}

}
