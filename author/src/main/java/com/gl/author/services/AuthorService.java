package com.gl.author.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.author.model.Author;
import com.gl.author.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	AuthorRepository repository;
	
	public List<Author> getAllAuthors()
	{
		return repository.findAll();
	}
	
	public Author getAuthorById(int id)

	{
		return repository.findById(id).get();
	}
	
	public Author saveAuthor(Author a)
	{
		return repository.save(a);
	}
	
	public Author updateAuthor(Author a,int id)
	{
		Optional<Author> existing=repository.findById(id);
		if(existing.isPresent())
		{
			Author old=existing.get();
			old.setName(a.getName());
			old.setMobile(a.getMobile());
			old.setNoOfBooks(a.getNoOfBooks());
			repository.save(old);
			return old;
		}
		else
			return null;
	}
	
	public String deleteAuthor(int id)
	{
		Author a=repository.findById(id).get();
		repository.delete(a);
		return "successful";
	}
	

}
