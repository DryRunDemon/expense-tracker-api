package com.expensetracker.service;

import com.expensetracker.entity.Expense;
import com.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Optional<Expense> getExpenseById(Long id) {
        return expenseRepository.findById(id);
    }

    public Expense updateExpense(Long id, Expense updatedExpense) {
        return expenseRepository.findById(id).map(existingExpense -> {
            existingExpense.setTitle(updatedExpense.getTitle());
            existingExpense.setAmount(updatedExpense.getAmount());
            existingExpense.setCategory(updatedExpense.getCategory());
            existingExpense.setExpenseDate(updatedExpense.getExpenseDate());
            existingExpense.setDescription(updatedExpense.getDescription());
            return expenseRepository.save(existingExpense);
        }).orElseThrow(() -> new RuntimeException("Expense not found with id: " + id));
    }

    public void deleteExpense(Long id) {
        if (!expenseRepository.existsById(id)) {
            throw new RuntimeException("Expense not found with id: " + id);
        }
        expenseRepository.deleteById(id);
    }
}