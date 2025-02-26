package com.minnobe.minnobe.services;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.minnobe.minnobe.classes.Minno;



@RestController
@RequestMapping("/user")
public class userservice {

    @GetMapping("/getUser")
    public Minno getUser(@RequestParam String param) {
        Minno user = new Minno();

        return user;
    }
    
    @PostMapping("/createUser")
    public Minno createUser(@RequestBody String entity) {
        //TODO: process POST request
        //isSoftDeleted = 0
        Minno user = new Minno();
        user.setUserID(entity);
        user.setUsername(entity);
        user.setEmail(entity);
        user.setPassword(entity);
        user.setPhonenumber(entity);
        user.setFirstname(entity);
        user.setLastname(entity);
        user.setBalance(0.00);


        return user;
    }

    @PutMapping("updateUser/{id}")
    public String updateUser(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        //Update UserInfo Table
        
        return entity;
    }

    @PutMapping("/updateUserRating/{userId}")
    public String putMethodName(@PathVariable String userId, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }

    @PutMapping("softDeleteUser/{id}")
    public String softDeleteUser(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        //Flip isSoftDeleted = 1
        
        return entity;
    }
    
    
}
