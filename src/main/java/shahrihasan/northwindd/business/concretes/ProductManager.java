package shahrihasan.northwindd.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shahrihasan.northwindd.business.abstracts.ProductService;
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
	public List<Product> getAll() {

		return this.productDao.findAll();
	}

}
