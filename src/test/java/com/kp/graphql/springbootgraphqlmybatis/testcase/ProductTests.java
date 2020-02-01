package com.kp.graphql.springbootgraphqlmybatis.testcase;

import com.kp.graphql.springbootgraphqlmybatis.mapper.ProductMapper;
import com.kp.graphql.springbootgraphqlmybatis.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void getProducts() {
        List<Product> checkForProducts = productMapper.getProducts();
        assertTrue(checkForProducts != null && checkForProducts.size() > 0);
    }

	@Test
	public void getProduct() {
		Product checkForProduct = productMapper.getProduct(1);
		assertTrue(checkForProduct != null);
	}
}