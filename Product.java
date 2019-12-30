package exam;

class Product {
	private String name;
	private String material;

	public Product(String name, String material) {
		this.name = name;
		this.material = material;
	}

	public String getName() {
		return name;
	}

	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return name + " (" + material + ")";
	}
}