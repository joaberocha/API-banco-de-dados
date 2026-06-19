package com.apibancodedados.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apibancodedados.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
