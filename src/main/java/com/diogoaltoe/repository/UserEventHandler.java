package com.diogoaltoe.repository;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.diogoaltoe.domain.Authority;
import com.diogoaltoe.domain.User;

@RepositoryEventHandler(User.class)
public class UserEventHandler {

	@Autowired
    private AuthorityRepository authorityRepository;
	
	@HandleBeforeCreate
    public void handleBeforeCreate(User user) {
		// Set the User as activated
		user.setActivated(true);
		
		// Instance the Set of authorities
		Set<Authority> authorities = new HashSet<Authority>();
		// Find the Admin Role
		// And add into Set list
		authorities.add(authorityRepository.findByName("ROLE_ADMIN"));
		// Find the User Role
		// And add into Set list
		authorities.add(authorityRepository.findByName("ROLE_USER"));
		// Create the User's authorities 
		user.setAuthorities(authorities);
    }
	
}
