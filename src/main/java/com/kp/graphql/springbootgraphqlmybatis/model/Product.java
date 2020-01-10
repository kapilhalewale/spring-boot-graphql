package com.kp.graphql.springbootgraphqlmybatis.model;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@Entity
public class Product {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String category;
}
