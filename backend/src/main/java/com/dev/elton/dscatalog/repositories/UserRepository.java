package com.dev.elton.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.elton.dscatalog.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	
	User findByEmail(String email);
}
