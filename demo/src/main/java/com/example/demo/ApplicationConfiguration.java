package com.example.demo;

import com.example.demo.product.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean // 스프링아, 아래 메소드가 반환하는 객체를 스프링 빈으로 등록해줘
    public ProductRepository productRepository() {  // 메소드 명은 반환하는 데이터 타입의 앞 글자를 소문자로만 바꿔서 짓기 (스프링이 빈 이름 지정하는 규칙이 이거라 똑같이 따라가는 것)
        return new ProductRepository();
    }
}
