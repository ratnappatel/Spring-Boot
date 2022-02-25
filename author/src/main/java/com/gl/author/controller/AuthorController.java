package com.gl.author.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gl.author.model.Author;
import com.gl.author.services.AuthorService;

//Exposing the resource which need to be secured via JWT-based authentication
@RestController
@RequestMapping("/api/authors")
public class AuthorController {
	
	@Autowired
	AuthorService service;
	
	@GetMapping("/")
	public List<Author> findAllAuthor()
	{
		return service.getAllAuthors();
	}
	
	//by-default rest api accepts data inth form of JSON-Object
	@PostMapping("/add")
	public Author addAuthor(@RequestBody Author a)
	{
		return service.saveAuthor(a);
	}
	
	@PutMapping("/edit/{id}")
	public Author editAuthor(@PathVariable Integer id,@RequestBody Author a)
 {
		return service.updateAuthor(a, id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String removeAuthor(@PathVariable Integer id)

	{
		return service.deleteAuthor(id);
	}
	
	@RequestMapping(value = "/get/{id}",method = RequestMethod.GET,produces = "application/json")
	//@GetMapping("/get/{id}")
	public Author getAuthor(@PathVariable Integer id)

	{
		return service.getAuthorById(id);
	}

}
