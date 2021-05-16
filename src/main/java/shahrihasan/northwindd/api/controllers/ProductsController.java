package shahrihasan.northwindd.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shahrihasan.northwindd.business.abstracts.ProductService;
import shahrihasan.northwindd.entitites.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService productservice;

	@Autowired
	public ProductsController(ProductService productservice) {
		super();
		this.productservice = productservice;
	}

	@GetMapping("/getall")
	public List<Product> getAll() {

		return this.productservice.getAll();

	}

}
