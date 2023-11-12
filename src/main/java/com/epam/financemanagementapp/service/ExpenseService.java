package com.epam.financemanagementapp.service;
import com.epam.financemanagementapp.dto.ExpenseRequest;
import com.epam.financemanagementapp.model.Expense;
import com.epam.financemanagementapp.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public void addExpense(ExpenseRequest expenseRequest) {
        Expense expense = new Expense();
        expenseRepository.save(expense);
    }
}
