package exam;

interface Storage {
	void addProduct(Product product);

	Product getProduct(int index);

	Product getProduct(String name);

	int numberOfProducts();
}