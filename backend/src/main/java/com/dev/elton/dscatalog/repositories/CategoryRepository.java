package com.dev.elton.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.elton.dscatalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
