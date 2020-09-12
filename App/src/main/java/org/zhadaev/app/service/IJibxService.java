package org.zhadaev.app.service;

import org.springframework.stereotype.Service;
import org.zhadaev.app.model.Product;

import java.util.List;

@Service
public interface IJibxService {
    List<Product> unMarshalProduct(final String inputXml);
}
