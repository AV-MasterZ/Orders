package org.zhadaev.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zhadaev.app.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
