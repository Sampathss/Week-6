package builder;

public class RepairState implements State {
	DoorKnobStates doorKnobStates;


	public RepairState(	DoorKnobStates doorKnobStates) {
		this.doorKnobStates = doorKnobStates;
	}

	@Override
	public void lock() {
		System.out.println("Under repair to lock");
	}

	@Override
	public void unlock() {
		System.out.println("Under repair to unlock");
	}

	@Override
	public void getIn() {
		System.out.println("Under repair to getIn");
	}

	@Override
	public void getOut() {
		System.out.println("Under repair to get out");
	}

	@Override
	public void open() {
		System.out.println("Under repair to open");
	}

	@Override
	public void close() {
		System.out.println("Under repair to close");
	}
	public void repair() {
		System.out.println("Repairing the doorKnob");
		DoorKnobBuilder glassKnobBuilder = new GlassDoorKnobBuilder();
		DoorKnob glassKnob = glassKnobBuilder.addCobalt().addCopper().addCrystal().addEmerald().addGlass().addZinc().build();
		glassKnob.prepare();
		glassKnob.coating();
		glassKnob.forging();
		glassKnob.surfacePreparation();
		glassKnob.pack();

		System.out.println(glassKnob);

		doorKnobStates.setState(doorKnobStates.getLockedState());

	}
	public String toString() {
		return " repair State";
	}

}
