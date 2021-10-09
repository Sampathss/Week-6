package builder;

public class DoorKnobStates {
	State faultyState;
	State lockedState;
	State unlockedState;
	State openState;
	State closedState;
	State repairState;

	State state;

	public DoorKnobStates() {
		faultyState = new FaultyState(this);
		lockedState = new LockedState(this);
		unlockedState = new UnlockedState(this);
		openState = new OpenState(this);
		closedState = new ClosedState(this);
		repairState = new RepairState(this);
		state = lockedState;
	}
	public void getIn() {
		state.getIn();
	}
	public void getOut() {
		state.getOut();
	}
	public void lock() {
		state.lock();
	}
	public void unlock() {
		state.unlock();
	}
	public void open() {
		state.open();
	}
	public void close(){
		state.close();
	}
	public void repair() {
		state.repair();
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public State getFaultyState() {
		return faultyState;
	}
	public State getLockedState() {
		return lockedState;
	}
	public State getRepairState() {
		return repairState;
	}
	public State getUnlockedState() {
		return unlockedState;
	}
	public State getOpenState() {
		return openState;
	}

	public State getClosedState() {
		return closedState;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();

		result.append("---- Jack n Jill Classic DoorKnobs ------");

		result.append("\nDoorknob is " + state + "\n");

		return result.toString();
	}

}
