package com.kp.graphql.springbootgraphqlmybatis.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kp.graphql.springbootgraphqlmybatis.model.Product;
import com.kp.graphql.springbootgraphqlmybatis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductQuery implements GraphQLQueryResolver {

    @Autowired
    private ProductService productService;

    public List<Product> getProducts() {
        return this.productService.getProducts();
    }

    public Product getProduct(final long id) {
        return this.productService.getProduct(id);
    }
}