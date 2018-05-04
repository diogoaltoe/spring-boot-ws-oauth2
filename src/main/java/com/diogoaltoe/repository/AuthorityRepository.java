package com.diogoaltoe.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.diogoaltoe.domain.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
