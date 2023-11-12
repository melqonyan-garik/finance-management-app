package com.epam.financemanagementapp.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class BudgetRequest {
    private Long userId;
    private BigDecimal amount;
    private String category;
    private LocalDate startDate;
    private LocalDate endDate;

}
