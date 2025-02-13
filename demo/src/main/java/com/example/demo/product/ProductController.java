package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    // 사용자가 요청을 던지면
    // 그에 맞는 로직을 수행할 수 있도록 서비스 호출

    @Autowired
    private ProductService productService;

    // 전체 상품 조회
    @GetMapping("/products")
    public List<Product> findProducts() {
        return productService.findProducts();  // JSON array
    }
    // 개별 상품 조회
//    @RequestMapping(value="/products/{id}", method=RequestMethod.GET)
    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable("id") int id) {
//        ProductService productService = new ProductService();
        return productService.findProduct(id);
    }

    //  상품 등록
//    @RequestMapping(value = "/products", method = RequestMethod.POST)
//    public void saveProduct(@RequestParam(value = "name") String productName) {
//        // localhost:8080/products?name=______ => productName
//        System.out.println("POST");
//        productService.saveProduct(productName);
//    }

//    @RequestMapping(value = "/products", method = RequestMethod.POST)
    @PostMapping("/products")
    public void saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }
}
