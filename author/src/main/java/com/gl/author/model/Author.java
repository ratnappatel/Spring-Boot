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

/*@Getter
@Setter
@NoArgsConstructor
@ToString*/
@Entity
@Table(name = "authors")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//internally uses auto_increment for mysql
	private int id;
	private String name;
	private String mobile;
	private int noOfBooks;
	public Author() {
		// TODO Auto-generated constructor stub
	}
	public Author(int id, String name, String mobile, int noOfBooks) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.noOfBooks = noOfBooks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", mobile=" + mobile + ", noOfBooks=" + noOfBooks + "]";
	}
	
	

}
