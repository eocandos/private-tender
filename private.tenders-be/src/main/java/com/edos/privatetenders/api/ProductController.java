package com.edos.privatetenders.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProductController {

    @GetMapping("/product")
    public String findAll() {
    	return "simple product response";
    }

}
