package com.testing.gateway.controller;

import com.testing.gateway.entity.ProductResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/product")
public class product {
    public ProductResponse testReport(){
        try{
            return new ProductResponse(
                    "AA001",
                    LocalDateTime.now().toString(),
                    true,
                    "test report successful using spring cloud api gateway"
            );
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
