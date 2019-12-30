package exam;
import java.util.ArrayList;

public class StorageRoom implements Storage{

	private ArrayList<Product> products = new ArrayList<Product>();
	
	StorageRoom(){
		
	}
	
	@Override
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public Product getProduct(int index) {
		return products.get(index);
	}

	@Override
	public Product getProduct(String name) {
		for (int i = 0; i < products.size();i++) {
			Product product = products.get(i);
			String productName = product.getName();
				
			if (productName == name) {
				
				return products.get(i);
			}
			else {
				
				continue;
			}
		}
		return null;
	}

	@Override
	public int numberOfProducts() {
		return products.size();
	}
	
}