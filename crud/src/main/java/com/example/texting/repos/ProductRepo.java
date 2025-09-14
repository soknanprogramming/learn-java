package com.example.texting.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.texting.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
