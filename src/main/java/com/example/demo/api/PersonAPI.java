package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@RestController
@RequestMapping("/api/v1/person")
public class PersonAPI {
	
	@Autowired
	PersonRepository personaRepository;
	
	@GetMapping
	public List<Person> findAll(){
		return personaRepository.findAll();
	}

	@GetMapping("/{id}")
	public Person findById(@RequestParam("id") Long id) {
		System.out.println(":::::algo");
		return personaRepository.findById(id);
	}
	
	@PostMapping
	public Person add(@RequestBody Person person) {
		personaRepository.add(person);
		return person;
	}

}
