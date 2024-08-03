package com.zentitech.crud.controllers;

import com.zentitech.crud.models.Product;
import com.zentitech.crud.services.ProductServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    private final ProductServices productServices;

    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @PostMapping(value = "/create")
    public Product createProduct(Product product){
        Product createProduct = productServices.createProduct(product);
        return createProduct;
    }
}