package nekkul.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nekkul.northwind.business.abstracts.ProductService;
import nekkul.northwind.entities.concretes.Product;

@RestController
@RequestMapping("api/products")
public class ProductsContoller {
	
	private ProductService productService;
	
	@Autowired
	public ProductsContoller(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
