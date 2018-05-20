package com.diogoaltoe.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.diogoaltoe.domain.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
	
	@Query
	Authority findByName(String name);
	
}
