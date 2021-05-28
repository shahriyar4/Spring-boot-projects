package shahrihasan.northwindd.business.abstracts;

import java.util.List;

import shahrihasan.northwindd.core.utilities.result.DataResult;
import shahrihasan.northwindd.core.utilities.result.Result;
import shahrihasan.northwindd.entitites.concretes.Product;

public interface ProductService {

	DataResult<List<Product>> getAll();

	 Result add(Product product);
}
