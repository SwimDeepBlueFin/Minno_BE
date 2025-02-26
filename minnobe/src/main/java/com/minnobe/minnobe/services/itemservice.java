package com.minnobe.minnobe.services;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


;

@RestController
@RequestMapping("/item")
public class itemservice {

    @GetMapping("/getItem/{userId}/{itemId}")
    public String getItem(@RequestParam String itemId, @RequestParam String userId) {
        return new String();
    }
    
    @GetMapping("/getAllItems/{userId}")
    public String getMethodName(@RequestParam String userId) {
        return new String();
    }
    
    @PostMapping("/createNewItem")
    public String createNewItem(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }

    @PutMapping("/updateItemCondition/{itemId}")
    public String updateItemCondition(@PathVariable String itemId, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }

    @PutMapping("/updateItemRating/{id}")
    public String updateItemRating(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }
    

}
