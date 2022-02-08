package br.com.newmann.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.newmann.model.person;
import br.com.newmann.service.PersonService;


@RestController
@RequestMapping("/person")
public class PersonController<Person> {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping
	public List<person> findAll(){
		try {
			try {
				return PersonService.findAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@GetMapping("/{name}")
	public person findOne(@PathVariable String name) {
		return personService.findOne(name);
	}
	
	@PostMapping
	public Map<String, String> insert(@RequestBody Person person){
		return PersonService.insert(person);
	}
	
	@PutMapping
	public Map<String,String> edit(@RequestBody Person person){
		return personService.edit(person);
	}
	
	@DeleteMapping("/{name}")
	public Map<String,String> remove(@PathVariable String name){
		return personService.remove(name);
	}

}
