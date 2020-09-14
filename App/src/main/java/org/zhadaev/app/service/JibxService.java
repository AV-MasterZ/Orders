package org.zhadaev.app.service;

import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;
import org.springframework.stereotype.Service;
import org.zhadaev.app.model.Product;
import org.zhadaev.app.model.ProductShell;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class JibxService implements IJibxService {

    private final String path;

    public JibxService() {
        path = System.getProperty("user.home");
    }

    public List<Product> unMarshalProduct(final String xmlFilename) {
        ProductShell productShell = null;
        try {
            IBindingFactory bfact = BindingDirectory.getFactory(ProductShell.class);
            IUnmarshallingContext uctx = bfact.createUnmarshallingContext();
            InputStream in = new FileInputStream(new File(path + File.separator + xmlFilename));
            productShell = (ProductShell) uctx.unmarshalDocument(in, null);
        } catch (JiBXException | FileNotFoundException e) {
            e.printStackTrace();
        }
        if (productShell == null) {
            productShell = new ProductShell();
            productShell.setProducts(new ArrayList<>());
        }
        return productShell.getProducts();
    }

}
