package com.example.texting.servers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.texting.models.Product;
import com.example.texting.repos.ProductRepo;

@Service
public class ProductServer {
    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProduts(){
        return repo.findAll();
    }

    public Product getProductById(int id){
        // return repo.findById(id).orElse(new Product());
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imagFile){
        try{
            product.setImageName(imagFile.getOriginalFilename());
            product.setImageType(imagFile.getContentType());
            product.setImageDate(imagFile.getBytes());
            return repo.save(product);
        }
        catch(IOException e){
            throw new RuntimeException("Error saving product with image", e);
        }
        
    }
}
