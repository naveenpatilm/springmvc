package naveen.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import naveen.springmvc.services.ProductService;

@Controller
public class ProductController {
	private ProductService productService;

	public ProductService getProductService() {
		return productService;
	}

	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping("/products")
	public String listAllProducts(Model model) {
		model.addAttribute("products", productService.listAllProducts());
		return "products";
	}
	
	@RequestMapping("/product/{id}")
	public String listAllProducts(@PathVariable int id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "product";
	}
}
