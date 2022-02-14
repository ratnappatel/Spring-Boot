package com.gl.employees.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.employees.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	User findByIdAndPassword(Integer id,String password);
}
