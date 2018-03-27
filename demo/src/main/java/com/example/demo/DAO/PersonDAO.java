package com.example.demo.DAO;

import java.util.Map;

import com.example.demo.Entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {

	private static Map<Integer, Person> persons;
	
}
