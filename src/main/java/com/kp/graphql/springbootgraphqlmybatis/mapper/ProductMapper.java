package com.kp.graphql.springbootgraphqlmybatis.mapper;

import com.kp.graphql.springbootgraphqlmybatis.model.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    List<Product> getProducts();
    List<Product> getProductByCategory(String category);
    Product getProduct(long id);
    void createProduct(Product product);
}
