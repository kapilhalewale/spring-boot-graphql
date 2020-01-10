package com.kp.graphql.springbootgraphqlmybatis.webservice;

import com.kp.graphql.springbootgraphqlmybatis.service.ProductService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductApi {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Object> getProducts(@RequestBody String query) {

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
