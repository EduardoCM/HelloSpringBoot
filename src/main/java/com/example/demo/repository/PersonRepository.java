package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Person;

public interface PersonRepository {
	
	public Person add(Person person);
	
	public List<Person> findAll();
	
	public Person findById(Long id);
	
	public void deleteById(Long id);

}
