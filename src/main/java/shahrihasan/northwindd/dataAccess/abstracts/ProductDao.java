package shahrihasan.northwindd.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import shahrihasan.northwindd.entitites.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
