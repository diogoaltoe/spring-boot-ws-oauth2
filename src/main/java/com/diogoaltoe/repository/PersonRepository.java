package com.diogoaltoe.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.diogoaltoe.domain.Person;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {//JpaRepository<Person, String> {

    //@Query("SELECT p FROM Person AS p WHERE LOWER(p.first_name) = LOWER(:firstName)")
    //Person findByFirstNameCaseInsensitive(@Param("firstName") String firstName);

}