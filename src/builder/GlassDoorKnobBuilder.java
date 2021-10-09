package builder;

public class GlassDoorKnobBuilder extends DoorKnobBuilder{

	public GlassDoorKnobBuilder() {
		this.name = "Glass Door Knob";
	}
	public DoorKnobBuilder addCrystal() {

		return this;
	}
	public DoorKnobBuilder addGlass() {

		return this;
	}
	public DoorKnobBuilder addEmerald() {

		return this;
	}
	public DoorKnobBuilder addCopper(){
		this.materials.add("Copper");
		return this;
	}
	public DoorKnobBuilder addZinc() {
		this.materials.add("Zinc");
		return this;
	}
	public DoorKnobBuilder addCobalt() {
		this.materials.add("Cobalt");
		return this;
	}

}
