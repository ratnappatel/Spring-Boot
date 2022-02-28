package com.gl.author.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "authors")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//internally uses auto_increment for mysql
	private int id;
	private String name;
	private String mobile;
	private int noOfBooks;
	
	public Author(int id, String name, String mobile, int noOfBooks) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.noOfBooks = noOfBooks;
	}
}
