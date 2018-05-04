package com.diogoaltoe.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.diogoaltoe.domain.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, String> {//JpaRepository<User, String> {

    @Query("SELECT u FROM User AS u WHERE LOWER(u.username) = LOWER(:username)")
    User findByUsernameCaseInsensitive(@Param("username") String username);

    @Query
    User findByEmail(String email);

    @Query
    User findByEmailAndActivationKey(String email, String activationKey);

    @Query
    User findByEmailAndResetPasswordKey(String email, String resetPasswordKey);

}