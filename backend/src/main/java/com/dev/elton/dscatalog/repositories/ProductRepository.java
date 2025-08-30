package com.dev.elton.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.elton.dscatalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
