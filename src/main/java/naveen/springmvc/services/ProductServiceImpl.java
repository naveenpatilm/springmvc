package naveen.springmvc.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import naveen.springmvc.domain.Product;

@Component
public class ProductServiceImpl implements ProductService {

	private Map<Integer, Product> products;

	public ProductServiceImpl() {
		loadAllProducts();
	}

	private void loadAllProducts() {
		products = new HashMap<Integer, Product>();
		Product product1 = new Product(1, "Pen Drive", 464, "sandisk.com");
		Product product2 = new Product(2, "Washing Machine", 21876, "ifb.com");
		Product product3 = new Product(3, "Shoes", 876, "nike.com");
		Product product4 = new Product(4, "Books", 99, "headfirst.com");
		products.put(1, product1);
		products.put(2, product2);
		products.put(3, product3);
		products.put(4, product4);
	}

	@Override
	public List<Product> listAllProducts() {
		return new ArrayList<>(products.values());
	}

	@Override
	public Product getProductById(int id) {
		return products.get(id);
	}

	@Override
	public Product saveOrUpdateProduct(Product product) {
		if (product == null) {
			throw new RuntimeException("Product cannot be null");
		}
		if (product.getId() == null) {
			product.setId(products.size() + 1);
		}
		products.put(product.getId(), product);
		return product;
	}
	
	@Override
	public void deleteProduct(int id) {
		products.remove(id);
	}

}
