package com.kp.graphql.springbootgraphqlmybatis.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.kp.graphql.springbootgraphqlmybatis.mapper.ProductMapper;
import com.kp.graphql.springbootgraphqlmybatis.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMutation implements GraphQLMutationResolver {

    @Autowired
    private ProductMapper productMapper;

    public Product createProduct(String name, String category){
        final Product product = new Product();
        product.setName(name);
        product.setCategory(category);
        productMapper.createProduct(product);
        return product;
    }

    public void deleteProduct(Long id){

    }
}
