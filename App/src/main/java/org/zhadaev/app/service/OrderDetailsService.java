package org.zhadaev.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhadaev.app.model.OrderDetails;
import org.zhadaev.app.repository.OrderDetailsRepository;

import java.util.List;

@Service
public class OrderDetailsService implements IOrderDetailsService {

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    public OrderDetails findById(final Long id) {
        return orderDetailsRepository.getOne(id);
    }

    @Override
    public List<OrderDetails> findAll() {
        return orderDetailsRepository.findAll();
    }
}
