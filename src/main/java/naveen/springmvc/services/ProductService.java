package naveen.springmvc.services;

import java.util.List;

import naveen.springmvc.domain.Product;

public interface ProductService {
	List<Product> listAllProducts();
	Product getProductById(int id);
}
