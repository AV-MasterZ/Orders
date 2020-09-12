package org.zhadaev.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhadaev.app.model.Product;
import org.zhadaev.app.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findById(final String id) {
        return productRepository.getOne(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void saveList(final List<Product> products) {
        for (Product product: products) {
            productRepository.save(product);
        }
    }
}
