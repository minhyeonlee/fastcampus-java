package generic;

public class GenericPrinter<T extends Material> {

	private T material;

	// getter, setter
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	public String toString() {
		return material.toString();
	}

	public void printing() {
		material.doPrinting();
	}
}
