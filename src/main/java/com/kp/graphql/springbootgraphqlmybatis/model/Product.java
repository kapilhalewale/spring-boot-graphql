package com.kp.graphql.springbootgraphqlmybatis.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode
public class Product {

    private long id;
    private String name;
    private String category;
    List<Discount> discounts;
}