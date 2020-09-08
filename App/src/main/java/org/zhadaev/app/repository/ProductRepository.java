package org.zhadaev.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zhadaev.app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
