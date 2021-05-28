package shahrihasan.northwindd.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shahrihasan.northwindd.business.abstracts.ProductService;
import shahrihasan.northwindd.core.utilities.result.DataResult;
import shahrihasan.northwindd.core.utilities.result.Result;
import shahrihasan.northwindd.core.utilities.result.SuccesDataResult;
import shahrihasan.northwindd.core.utilities.result.SuccessResult;
import shahrihasan.northwindd.dataAccess.abstracts.ProductDao;
import shahrihasan.northwindd.entitites.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {

		return new SuccesDataResult<List<Product>>(this.productDao.findAll(), "Data listləndi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Urun eklendi ");
	}

}
