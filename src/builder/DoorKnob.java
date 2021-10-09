package builder;
import java.util.*;
public class DoorKnob {


	String name;
	List<String> materials;
	public void addMaterials(List<String> materials) {
		this.materials = materials;
	}

	void prepare() {
		System.out.println("Prepare " + name );
		System.out.println("Mixing materials");
		for(String material : materials) {
			System.out.println("   " + material);
		}

	}
	void forging() {
		System.out.println("The billet is heated and pressed to doornob shape and after its ejected it is cooled, trimmed to size and cleaned to remove heat scale produced.\n");
	}
	void surfacePreparation() {
		System.out.println("The Surface is coined, milled, drilled and tapped to prodece a surface ready for polishing operation");
	}
	void coating() {
		System.out.println("Organic or inorganic coating is applied");
	}
	void pack() {
		System.out.println("DoorKnobs ready to be supplied");
	}
	public void setName(String name ) {
		this.name = name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("----" + this.name + "-----");
		for(String material: materials) {
			display.append(material + "\n");
		}
		return display.toString();
	}
}
