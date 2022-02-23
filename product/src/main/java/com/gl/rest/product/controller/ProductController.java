package com.gl.rest.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.rest.product.entity.Product;
import com.gl.rest.product.repository.ProductRepository;

@RestController // is a combination of @Controller+allow developer to modify response
// with @RestController we can send response as html/xml/json/text
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductRepository repository;
	
	@GetMapping("/products") // REST-Endpoints http://localhost:8080/api/products
	public List<Product> getAllProduct()

	{
		//implicit sql executed by JpaRepository is select * from product
		return repository.findAll();		
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product p)

	{
		return repository.save(p);
	}
	
	// {id} is the path variable added into url 
	@PutMapping("/products/{id}")
	public Product editProduct(@RequestBody Product p,@PathVariable Integer id)
	{
		Optional<Product> oldProduct=repository.findById(id);
		if(oldProduct.isPresent())
		{
			Product old=oldProduct.get();
			old.setId(p.getId());
			old.setName(p.getName());
			old.setPrice(p.getPrice());
			return repository.save(old);
		}
		else
			return null;
	}
	
	@DeleteMapping("/products/{id}")
	public void remove(@PathVariable Integer id)
	{
		repository.deleteById(id);
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable Integer id)
	{
		return repository.getById(id);
	}
	
}
