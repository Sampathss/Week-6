package builder;

public class DoorKnobBuilderDemo {

	public static void main(String[] args) {
		DoorKnobStates states = new DoorKnobStates();

		System.out.println(states);
		states.unlock();
		states.repair();System.out.println(states);
		states.open();System.out.println(states);
		states.close();System.out.println(states);

		states.close();

		System.out.println(states);


		states.repair();
		System.out.println(states);
		states.repair();
	}

}
