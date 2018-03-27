package com.example.demo.repository;

import com.example.demo.Entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {
	public Person findByEmail(String email);
	/***public Person findUsingEmail(String email);******/
	
}
