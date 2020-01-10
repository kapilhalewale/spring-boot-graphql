package com.kp.graphql.springbootgraphqlmybatis.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.kp.graphql.springbootgraphqlmybatis.model.Product;
import com.kp.graphql.springbootgraphqlmybatis.service.ProductService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMutation implements GraphQLMutationResolver {

    @Autowired
    private ProductService productService;

    public Product createProduct(String name, String category){
        final Product product = new Product();
        product.setName(name);
        product.setCategory(category);
        return productService.createProduct(product);
    }

    public void deleteProduct(Long id){
        productService.deleteProduct(id);
    }
}
