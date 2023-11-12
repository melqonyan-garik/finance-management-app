package com.epam.financemanagementapp.service;
import com.epam.financemanagementapp.dto.BudgetRequest;
import com.epam.financemanagementapp.model.Budget;
import com.epam.financemanagementapp.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    public void addBudget(BudgetRequest budgetRequest) {
        // Perform business logic, validation, and save the budget
        Budget budget = new Budget();
        // Set budget properties from budgetRequest
        budgetRepository.save(budget);
    }

    public List<Budget> getUserBudgets(Long userId) {
        // Retrieve budgets for a specific user
        return budgetRepository.findByUserId(userId);
    }
}

