package com.example.texting.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.texting.models.Product;
import com.example.texting.servers.ProductServer;

@RestController
@CrossOrigin // provend cross site error
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductServer server;

    @GetMapping("/")
    public String greet(){
        return "Hello World";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        System.out.println("/products is working");
        return server.getAllProduts();
    }
}
