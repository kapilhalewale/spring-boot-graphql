package com.kp.graphql.springbootgraphqlmybatis.repository;

import com.kp.graphql.springbootgraphqlmybatis.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}