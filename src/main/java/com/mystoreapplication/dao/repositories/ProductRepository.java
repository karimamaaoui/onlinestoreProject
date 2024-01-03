package com.mystoreapplication.dao.repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mystoreapplication.dao.entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Long>  {
	Optional<Product> findByCode(String code);
	List<Product> findByCategoryId(Long id);

}
