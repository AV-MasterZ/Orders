package org.zhadaev.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhadaev.app.model.Order;
import org.zhadaev.app.model.Product;
import org.zhadaev.app.service.IJibxService;
import org.zhadaev.app.service.IOrderService;
import org.zhadaev.app.service.IProductService;
import org.zhadaev.app.service.ISoapClientService;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IProductService productService;

    @Autowired
    private IJibxService jibxService;

    @Autowired
    private ISoapClientService soapClientService;

    @GetMapping("/date")
    public char[] getDate() {
        String date = soapClientService.getDate();
        return date.toCharArray();
    }

    @GetMapping("/orders")
    public List<Order> getOrdersList() {
        return orderService.findAll();
    }

    @GetMapping("/update")
    public List<Order> updateProducts() {
        final String xmlFile = "products.xml";
        List<Product> products = jibxService.unMarshalProduct(xmlFile);
        productService.saveList(products);
        return orderService.findAll();
    }

}
