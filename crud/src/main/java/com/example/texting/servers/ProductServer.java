package com.example.texting.servers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.texting.models.Product;
import com.example.texting.repos.ProductRepo;

@Service
public class ProductServer {
    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProduts(){
        return repo.findAll();
    }
}
