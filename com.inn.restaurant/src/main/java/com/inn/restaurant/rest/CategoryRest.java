package com.inn.restaurant.rest;

import com.inn.restaurant.POJO.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/category")
public interface CategoryRest {

    @PostMapping(path = "/add")
    ResponseEntity<String> addNewCategory(@RequestBody(required = true)
                                          Map<String,String> requestMap);

    @GetMapping(path = "/get")
    ResponseEntity<List<Category>> getAllCategory(@RequestParam(required = false)
                                                   String filterValue);


    @PostMapping(path = "/update")
    ResponseEntity<String> updateCategory(@RequestBody(required = true)
                                          Map<String,String> requestMap);
}
