package com.kp.graphql.springbootgraphqlmybatis.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Discount {

    private long productId;
    private String offerName;
    private String percentage;
    private String status;
}