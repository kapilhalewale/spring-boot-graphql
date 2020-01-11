package com.kp.graphql.springbootgraphqlmybatis.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Product {

    private long id;
    private String name;
    private String category;
}