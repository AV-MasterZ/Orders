package org.zhadaev.app.service;

import org.springframework.stereotype.Service;
import org.zhadaev.app.model.OrderDetails;

import java.util.List;

@Service
public interface IOrderDetailsService {
    OrderDetails findById(final Long id);
    List<OrderDetails> findAll();
}
