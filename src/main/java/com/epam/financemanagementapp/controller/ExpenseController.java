package com.epam.financemanagementapp.controller;

import com.epam.financemanagementapp.dto.ExpenseRequest;
import com.epam.financemanagementapp.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/add")
    public ResponseEntity<String> addExpense(@RequestBody ExpenseRequest expenseRequest) {
        // Validate the request, perform business logic, and save the expense
        expenseService.addExpense(expenseRequest);

        return ResponseEntity.ok("Expense added successfully");
    }
}
