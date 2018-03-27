package com.example.demo.Service;

import com.example.demo.Entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Object findAll(){
        return personRepository.findAll();
    }

    public Optional<Person> findById(Long id){
        return personRepository.findById(id);
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

    public void delete(Person person){
    	personRepository.delete(person);
    	return;
    }

	public Person findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
