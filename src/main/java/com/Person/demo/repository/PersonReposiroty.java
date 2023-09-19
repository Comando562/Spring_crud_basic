package com.Person.demo.repository;

import com.Person.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//This class will going to help to make operations in our DB like , Delet, save, findAll etc
@Repository
public interface PersonReposiroty extends JpaRepository<Person, Long> {
    List<Person> findByName(@Param("name")String name);
}
