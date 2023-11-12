package com.epam.financemanagementapp.controller;

import com.epam.financemanagementapp.service.YodleeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/yodlee")
public class YodleeController {

    @Autowired
    private YodleeService yodleeService;

    @GetMapping("/accounts")
    public ResponseEntity<String> getUserAccounts(@RequestParam String userSessionToken) {
        String accounts = yodleeService.getUserAccounts(userSessionToken);
        return ResponseEntity.ok(accounts);
    }
}

