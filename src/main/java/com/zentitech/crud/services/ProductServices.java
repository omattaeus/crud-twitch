package com.zentitech.crud.services;

import com.zentitech.crud.models.Product;
import com.zentitech.crud.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {

    private final ProductRepository productRepository;

    public ProductServices(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public Product createProduct(Product product){

        if(product == null){
            throw new RuntimeException("Product connot be null!");
        }

        var productSave = productRepository.save(product);

        return productSave;
    }
}