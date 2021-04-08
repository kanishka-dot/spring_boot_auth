package com.example.demo.repositary;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.User;


public interface UserRepositary extends CrudRepository<User, Integer> {
	
	
	@Query("SELECT u FROM User u WHERE u.username = :username")
	public User getUserByUser_name(@Param("username") String username);
}
