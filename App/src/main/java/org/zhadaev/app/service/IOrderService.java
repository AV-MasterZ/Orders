package org.zhadaev.app.service;

import org.springframework.stereotype.Service;
import org.zhadaev.app.model.Order;

import java.util.List;

@Service
public interface IOrderService {
    Order findById(final Long id);
    List<Order> findAll();
}
