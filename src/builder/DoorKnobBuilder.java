package builder;
import java.util.*;
public abstract class DoorKnobBuilder {
	String name;
	List<String> materials = new ArrayList<String>();
	public abstract DoorKnobBuilder addCrystal();
	public abstract DoorKnobBuilder addGlass();
	public abstract DoorKnobBuilder addEmerald();
	public abstract DoorKnobBuilder addCopper();
	public abstract DoorKnobBuilder addZinc();
	public abstract DoorKnobBuilder addCobalt();


	public DoorKnob build() {
		DoorKnob  doorKnob = new DoorKnob();
		doorKnob.setName(this.name);
		doorKnob.addMaterials(materials);
		return doorKnob;
	}

}
