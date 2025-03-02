package com.minnobe.minnobe.services;

import java.util.Map;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

;

@RestController
@RequestMapping("transaction")
public class transactionservice {

    @GetMapping("/getSingleTransaction/{param}")
    public String getTransaction(@RequestParam String param) {
        return new String();
        //Hits local DB
    }

    @GetMapping("/getTransactionHistory/{userId}")
    public String getTransactionHistory(@RequestParam String userId) {
        return new String();
        //Hits local DB
    }
    
    @GetMapping("/getLatestTransaction/{userId}")
    public String getLatestTransaction(@RequestParam String userIdd) {
        return new String();
        //Hits local DB
    }
    
    
    @PostMapping("/createTransaction")
    public Map<String, Object>  createTransaction(@RequestBody Map<String, Object> entity) {
        //TODO: process POST request
        //Hit Stripe API for Create Charge
        //Log transaction in Transaction Table
        return entity;
    }

    @PostMapping("/payOwner")
    public Map<String, Object>  postMethodName(@RequestBody Map<String, Object> entity) {
        //TODO: process POST request
        //Hit Stripe API for Create Payout
        //Log Transaction in Transaction
        
        return entity;
    }
    
    
    

}
