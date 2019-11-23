package com.xianglei.parkyy_service.service;

import com.xianglei.parkyy_service.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProduct();

    Product findById(int id);


}
