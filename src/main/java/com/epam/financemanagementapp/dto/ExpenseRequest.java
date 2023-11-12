package com.epam.financemanagementapp.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExpenseRequest {
    private Long userId;
    private BigDecimal amount;
    private String description;
    private String category;
    private LocalDate date;

    // Getters and setters
}