package com.Person.demo.controller;


import com.Person.demo.model.Person;
import com.Person.demo.repository.PersonReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// In Controller there are all references for make a CRUD.

@RestController
@RequestMapping ("/api")
public class PersonController {

    @Autowired
    private PersonReposiroty repository;

    @GetMapping("/persons")
    public List<Person> allPersons() {
        return repository.findAll();
    }

    @GetMapping("/person/{name}")//name is dynamic not for specific
        public List<Person> findByName(@PathVariable("name") String name){
            return repository.findByName(name);

    }
    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person){
        return repository.save(person);
    }

    @PutMapping("/person/{id}")
    public Person updatePerson(@PathVariable int id, @RequestBody Person person){
        return repository.save(person);
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

}

