package com.epam.financemanagementapp.controller;

import com.epam.financemanagementapp.dto.BudgetRequest;
import com.epam.financemanagementapp.model.Budget;
import com.epam.financemanagementapp.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budgets")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;

    @PostMapping("/add")
    public ResponseEntity<String> addBudget(@RequestBody BudgetRequest budgetRequest) {
        // Validate the request, perform business logic, and save the budget
        budgetService.addBudget(budgetRequest);

        return ResponseEntity.ok("Budget added successfully");
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Budget>> getUserBudgets(@PathVariable Long userId) {
        // Retrieve and return the budgets for a specific user
        List<Budget> userBudgets = budgetService.getUserBudgets(userId);

        return ResponseEntity.ok(userBudgets);
    }
}
