package com.gl.rest.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.rest.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	// read all records 

}
