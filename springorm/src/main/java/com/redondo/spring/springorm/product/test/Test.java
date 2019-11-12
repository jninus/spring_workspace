package com.redondo.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.redondo.spring.springorm.product.dao.ProductDao;
import com.redondo.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/redondo/spring/springorm/product/test/config.xml");

		ProductDao productDao = (ProductDao) context.getBean("productDao");
//		Product product = new Product();
//		product.setId(3);
//		product.setName("Samsung");
//		product.setDesc("Nice korean Phone !");
//		product.setPrice(500);
		List<Product> products = productDao.findAll();	
		System.out.println(products);
	//	productDao.update(product);
	//	productDao.delete(product);
	//	productDao.create(product);


	}

}
