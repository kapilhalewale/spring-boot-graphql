package com.kp.graphql.springbootgraphqlmybatis.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kp.graphql.springbootgraphqlmybatis.mapper.ProductMapper;
import com.kp.graphql.springbootgraphqlmybatis.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductQuery implements GraphQLQueryResolver {

    @Autowired
    private ProductMapper productMapper;

    public List<Product> getProducts() {
        return this.productMapper.getProducts();
    }

    public Product getProduct(final long id) {
        return this.productMapper.getProduct(id);
    }

    public List<Product> getProductByCategory(String category) {
        return this.productMapper.getProductByCategory(category);
    }
}