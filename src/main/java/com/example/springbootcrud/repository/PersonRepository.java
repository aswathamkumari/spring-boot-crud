package com.example.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootcrud.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	
}

