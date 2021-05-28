package shahrihasan.northwindd.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shahrihasan.northwindd.business.abstracts.ProductService;
import shahrihasan.northwindd.core.utilities.result.DataResult;
import shahrihasan.northwindd.core.utilities.result.Result;
import shahrihasan.northwindd.entitites.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService productService;

	@Autowired
	public ProductsController(ProductService productservice) {
		super();
		this.productService = productservice;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll() {

		return this.productService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {

		return this.productService.add(product);

	}

}
