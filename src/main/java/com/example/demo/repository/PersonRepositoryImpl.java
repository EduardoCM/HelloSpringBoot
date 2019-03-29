package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;
import com.example.demo.model.Sexo;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
	
	private static List<Person> personas = new ArrayList<>();

	static {
		Person person = new Person();
		
		person.setId(1l);
		person.setNombre("Eduardo");
		person.setApellidos("Castillo Mendoza");
		person.setEdad(28);
		person.setSexo(Sexo.MASCULINO);
		
		personas.add(person);
	}
	
	@Override
	public Person add(Person person) {
		person.setId((long) (personas.size()+1));
		personas.add(person);
		return person;
	}

	@Override
	public List<Person> findAll() {
		return personas;
	}

	@Override
	public Person findById(Long id) {
		return personas.stream().filter(it -> it.getId().equals(id)).findFirst().get();
	}

	@Override
	public void deleteById(Long id) {
		personas.remove(id);
	}
	
	

}
